package hard;

import createLinkedList.ConvertArrayToLinkedList;
import createLinkedList.ListNode;

public class ReverseNodesinkGroup {

    static int arr[]={1,2,3,4,5};
    static ListNode list= ConvertArrayToLinkedList.convertToList(arr);
    public static void main(String args[]){
        int k=2;
        list=reverseKGroup(list,k);
        System.out.println(list.toString());
    }

    private static ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null){
            ListNode kthNode=kthLimit(temp,k);
            if(kthNode==null){
               if(prev!=null){
                   prev.next=temp;
               }
                break;
            }
            ListNode newNode=kthNode.next;
            kthNode.next=null;
            reverse(temp);
            if(temp==head)
                head=kthNode;
            else{
                prev.next=kthNode;
            }
            prev=temp;
            temp=newNode;
        }
        return head;
    }

    private static ListNode reverse(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        ListNode front=null;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

    private static ListNode kthLimit(ListNode temp, int k) {
        k=k-1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
}
