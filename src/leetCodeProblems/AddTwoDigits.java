package leetCodeProblems;

public class AddTwoDigits {

    //https://leetcode.com/problems/add-two-numbers/submissions/
}



class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode ptr1;
        ListNode ptr2;

        int digitsum = 0;
        int carryForward = 0;

        ListNode curr = null;
        ListNode head = new ListNode();



        ptr1 = l1;
        ptr2 = l2;

        while(ptr1!=null || ptr2!=null){

            int a = ptr1!=null?ptr1.val:0;
            int b = ptr2!=null?ptr2.val:0;

            digitsum = a + b + carryForward;

            carryForward = digitsum/10;
            digitsum = digitsum%10;


            if(curr == null){
                //initialize new list
                curr = new ListNode(digitsum,null);
                head = curr;
            }else{
                //add to List
                ListNode newNode = new ListNode(digitsum,null);
                curr.next = newNode;
                curr = newNode;
            }
            ptr1 = ptr1!=null?ptr1.next:null;
            ptr2 = ptr2!=null?ptr2.next:null;

        }

        if(carryForward!=0){
            ListNode newNode = new ListNode(carryForward,null);
            curr.next = newNode;
            curr = newNode;
        }

        return head;
    }



}
