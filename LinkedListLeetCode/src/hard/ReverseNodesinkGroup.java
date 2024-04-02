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
        return head;
    }
}
