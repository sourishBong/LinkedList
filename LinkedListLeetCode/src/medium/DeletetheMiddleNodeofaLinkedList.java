package medium;

import createLinkedList.ConvertArrayToLinkedList;
import createLinkedList.ListNode;

public class DeletetheMiddleNodeofaLinkedList {

   // static int arr[]={1,3,4,7,1,2,6};
    static int arr[]={2,1};
    static ListNode list= ConvertArrayToLinkedList.convertToList(arr);
    public static void main(String args[]){
        list=deleteMiddle(list);
        System.out.println(list.toString());
    }

    private static ListNode deleteMiddle(ListNode head) {
        if(head==null)
            return head;
        if(head.next==null){
            return null;
        }
//        if(head.next.next==null){
//            head.next=null;
//            return head;
//        }
        ListNode fast=head.next;
        ListNode slow=head;

        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
