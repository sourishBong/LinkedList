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

    //will not clear all test cases
    private static ListNode removeNthFromEndNotOptimized(ListNode head, int n) {
        // code here
        if(head==null || head.next==null)
            return head;
        int count=1;
        int len=0;
        ListNode temp=head;

        while(temp!=null){
            len++;
            temp=temp.next;
        }
        temp=head;
        while(count<(len-n)){
            temp=temp.next;
            count++;
        }
        //if(temp.next!=null)
        temp.next=temp.next.next;
        return head;
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
