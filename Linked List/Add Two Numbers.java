/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
   ListNode rel = new ListNode(0);
        ListNode rel_point = rel;

        int carry = 0;
        ListNode n1 = l1;
        ListNode n2 = l2;
        while (n1 != null || n2 != null) {
            if (n1 != null && n2 != null) {
                carry = (n1.val + n2.val+ rel_point.val) / 10;
                rel_point.val = (n1.val + n2.val + rel_point.val) % 10;
                if (carry != 0 || n1.next != null || n2.next != null) {
                    rel_point.next = new ListNode(carry);
                }
                rel_point = rel_point.next;
                n1 = n1.next;
                n2 = n2.next;
            }
           else if (n2 != null) {
                carry = (n2.val+rel_point.val) / 10;
                rel_point.val =(n2.val+rel_point.val)% 10;
                if ( n2.next != null||carry!=0) {
                    rel_point.next = new ListNode(carry);
                }
                rel_point = rel_point.next;
                n2 = n2.next;
            }
           else if (n1 != null) {
                carry =(n1.val+rel_point.val)/10;
                rel_point.val =(n1.val+rel_point.val)%10;
                if ( n1.next != null||carry!=0) {
                    rel_point.next = new ListNode(carry);
                }
                rel_point = rel_point.next;
                n1 = n1.next;
            }

        }
        return rel;
    }
}