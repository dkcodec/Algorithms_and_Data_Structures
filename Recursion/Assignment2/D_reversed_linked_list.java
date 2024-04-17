package Recursion.Assignment2;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class D_reversed_linked_list {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(15);

        D_reversed_linked_list solution = new D_reversed_linked_list();
        ListNode reversedList = solution.reverseList(head);

        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode = null;

        while (current != null) {
            nextNode = current.next; // Store the next node
            current.next = prev;     // Reverse the current node's pointer
            prev = current;          // Move pointers one position ahead
            current = nextNode;      // Move pointers one position ahead
        }

        return prev; // Prev is pointing to the new head of the reversed list
    }
}
