/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return dummy.next;
    }
     public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode mergeSort(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode middle = middleNode(head);
        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null;
        leftHead = mergeSort(leftHead);
        rightHead = mergeSort(rightHead);

        return mergeTwoLists(leftHead, rightHead);
    }
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
}