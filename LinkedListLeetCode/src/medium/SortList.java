package medium;

import createLinkedList.ConvertArrayToLinkedList;
import createLinkedList.ListNode;

public class SortList {

    static int arr[]={4,2,1,3};
    static ListNode list= ConvertArrayToLinkedList.convertToList(arr);
    public static void main(String args[]){
        list=sortList(list);
        System.out.println(list.toString());
    }

    private static ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode middle=findMiddle(head);
        ListNode rightHead=middle.next;
        middle.next=null;
        ListNode leftHead=head;

        leftHead=sortList(leftHead);
        rightHead=sortList(rightHead);

        return merge(leftHead,rightHead);
    }

    private static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                temp=list1;
                list1=list1.next;
            }else{
                temp.next=list2;
                temp=list2;
                list2=list2.next;
            }
        }
            if(list1!=null)
                temp.next=list1;
            if(list2!=null)
                temp.next=list2;

            return dummy.next;

    }

    private static ListNode findMiddle(ListNode head) {
        ListNode fast=head.next;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }




}
