public class ReverseLinkedList {
    // #206, 3/21/2022

    public static void main(String[] args) {
        System.out.println();
    }

    public static ListNode reverseLinkedList(ListNode head) {
        // O(N) time, O(N) space??

        if (head == null) {
            return null;
        }

        // calls to new ListNode add to space complexity
        ListNode res = new ListNode(head.val);

        while (head.next != null) {
            ListNode temp = new ListNode(head.next.val, res);
            temp = res;
            head = head.next;
        }
        return res;
    }

    public static ListNode reverseLinkedListInPlace(ListNode head) {
        // O(N) time, O(1) space

        ListNode res = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = res;
            res = head;
            head = next;
        }
        return res;
    }
}
