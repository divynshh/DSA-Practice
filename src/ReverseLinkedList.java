public class ReverseLinkedList {
    static ListNode head;
    public static void main(String args[]){

        ListNode n1 = new ListNode();
        ListNode n2 = new ListNode();
        ListNode n3 = new ListNode();
        ListNode n4 = new ListNode();
        n1.data = 5;
        n1.next = n2;
        n2.data = 6;
        n3.data = 7;
        n4.data = 8;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        head = n1;
        reverse(head,null );
        printList(head);

    }
    // 1 - 2 -3 -4 -null
    static void reverse(ListNode h,ListNode prev){ //
        if(h.next!=null){
            reverse(h.next,h);
        }
            if(h.next == null){
                head = h;
            }
            if(prev==null) {
                h.next = null;
            }
        h.next = prev;
    }

 static void printList(ListNode head){
        ListNode temp = head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}

class ListNode{

    int data;
    ListNode next;

}