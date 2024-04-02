package medium;

import createLinkedList.ConvertArrayToLinkedList;
import createLinkedList.ListNode;

public class RemoveNthNodeFromEndofList {

    static int arr[]={1,2,3,4,5};
    static ListNode list= ConvertArrayToLinkedList.convertToList(arr);
    public static void main(String args[]){
        int n=2;
        list=removeNthFromEnd(list,n);
        System.out.println(list.toString());
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fast=head;
            for(int i=0;i<n;i++){
                fast=fast.next;
            }
            if(fast==null)
                return head.next;
            ListNode slow=head;
            while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }

            slow.next=slow.next.next;
            return head;
    }
}
