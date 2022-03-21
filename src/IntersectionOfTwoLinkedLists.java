public class IntersectionOfTwoLinkedLists {
    // #160, 1/11/2022

    public static void main(String[] args) {
        System.out.println();
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // O(M + N) time, O(1) space

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            if (a == null) {
                a = headB;
            }
            else {
                a = a.next;
            }

            if (b == null) {
                b = headA;
            }
            else {
                b = b.next;
            }
        }
        return a;
    }
}
