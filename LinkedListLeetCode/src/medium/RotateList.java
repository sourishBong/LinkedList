package medium;

import createLinkedList.ConvertArrayToLinkedList;
import createLinkedList.ListNode;

public class RotateList {

    static int arr[]={1,2,3,4,5};
    static ListNode list= ConvertArrayToLinkedList.convertToList(arr);
    public static void main(String args[]){
        int k=2;
        list=rotateRight(list,k);
        System.out.println(list.toString());
    }

    private static ListNode rotateRight(ListNode head, int k) {
        //edge cases
        if(head==null || head.next==null ||k==0)
            return head;

        ListNode curr=head;
        int len=1;

        //compute the length
        while(curr.next!=null){
            curr=curr.next;
            len++;
        }


        //k%len witll give the actual nuber of rotations
        k=len-(k%len);

        //go till that node
        curr.next=head;

        while(k>0){
            curr=curr.next;
            k--;
        }

        //make the node head and break connection;
        head=curr.next;
        curr.next=null;

        return head;
    }

    //n^2 solution where time limit is exceeding --- O(k*n)
    private static ListNode rotateRightNotOptimized(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        int count=0;
        ListNode rotated=null;
        ListNode temp=null;
        while(count<k){
            temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            rotated=temp.next;
            temp.next=null;
            rotated.next=head;
            head=rotated;
            count++;
        }
        return head;
    }
}
