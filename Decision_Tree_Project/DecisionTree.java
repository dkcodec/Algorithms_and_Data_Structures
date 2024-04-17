package Decision_Tree_Project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DecisionTree {
    private Map<String, Map<String, String>> tree;

    public DecisionTree() {
        tree = new HashMap<>();
        // Define the decision tree structure
        Map<String, String> exerciseBranch = new HashMap<>();
        exerciseBranch.put("Yes", "fruitsAndVegetables");
        exerciseBranch.put("No", "recommendation1");

        Map<String, String> fruitsAndVegetablesBranch = new HashMap<>();
        fruitsAndVegetablesBranch.put("0-1", "recommendation2");
        fruitsAndVegetablesBranch.put("2-3", "recommendation3");
        fruitsAndVegetablesBranch.put("4 or more", "recommendation4");

        tree.put("exerciseRegularly", exerciseBranch);
        tree.put("fruitsAndVegetables", fruitsAndVegetablesBranch);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String currentQuestion = "exerciseRegularly";

        while (true) {
            Question question = getQuestion(currentQuestion);
            System.out.println(question.getText());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            String option = options.get(choice - 1);
            String nextQuestion = tree.get(currentQuestion).get(option);
            if (nextQuestion.startsWith("recommendation")) {
                displayRecommendation(nextQuestion);
                break;
            }
            currentQuestion = nextQuestion;
        }
        scanner.close();
    }

    private Question getQuestion(String key) {
        switch (key) {
            case "exerciseRegularly":
                return new Question("Do you exercise regularly?", List.of("Yes", "No"));
            case "fruitsAndVegetables":
                return new Question("How many servings of fruits and vegetables do you consume per day?",
                        List.of("0-1", "2-3", "4 or more"));
            default:
                return null;
        }
    }

    private void displayRecommendation(String recommendationKey) {
        switch (recommendationKey) {
            case "recommendation1":
                System.out.println("Recommendation: Consider incorporating regular exercise into your routine.");
                break;
            case "recommendation2":
                System.out.println("Recommendation: Try to increase your intake of fruits and vegetables.");
                break;
            case "recommendation3":
                System.out.println("Recommendation: You're doing well with your fruits and vegetables intake.");
                break;
            case "recommendation4":
                System.out.println("Recommendation: Keep up the good work with your fruits and vegetables intake!");
                break;
        }
    }
}
