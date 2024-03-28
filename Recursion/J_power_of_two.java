package Recursion;

/*  Task 10  */
/*
    For the following task:
        • Any other libraries except very basic ones are NOT allowed.
        • Global and Static variables are not allowed.
        • You can’t add more parameters or call helper functions.
    Power of two. Given 1 parameter - an integer n, return true if it is a power of
    two. Otherwise, return false.

    An integer n is a power of two, if there exists an integer x such that n = 2^x

    Test the function properly in main and give the output as shown in Figure 1.

    Figure 1:
        0 is not a power of two
        1 is a power of two
        2 is a power of two
        3 is not a power of two
        4 is a power of two
        5 is not a power of two
        6 is not a power of two
        7 is not a power of two
        8 is a power of two
        9 is not a power of two
        10 is not a power of two
        12 is not a power of two
        14 is not a power of two
        16 is a power of two
        18 is not a power of two
        20 is not a power of two
        22 is not a power of two
        24 is not a power of two
        26 is not a power of two
        28 is not a power of two
        30 is not a power of two
        32 is a power of two
*/

public class J_power_of_two {
    public static void main(String[] args) {
        for (int i = 0; i < 32; i++) {
            if (i > 10) i++;
            if(isPowerOfTwo(i)) System.out.println(i + " is a power of two");
            else System.out.println(i + " is not a power of two");
        }
    }

    private static Boolean isPowerOfTwo(int n){
        if (n <= 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 2 != 0) {
            return false;
        } else {
            return isPowerOfTwo(n / 2); // Return the result of recursive call
        }
    }
}
