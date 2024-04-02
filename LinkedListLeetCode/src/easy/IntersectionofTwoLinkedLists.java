package easy;

import createLinkedList.ConvertArrayToLinkedList;
import createLinkedList.ListNode;

public class IntersectionofTwoLinkedLists {

    static int arr1[]={4,1,8,4,5};
    static int arr2[]={5,6,1,8,4,5};
    static ListNode list1= ConvertArrayToLinkedList.convertToList(arr1);
    static ListNode list2= ConvertArrayToLinkedList.convertToList(arr2);
    public static void main(String args[]){
        ListNode list=getIntersectionNode(list1,list2);
        if(list!=null)
        System.out.println(list1.toString());
        else
            System.out.println("null");
    }

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
            return null;

        //assigning dummy nodes to traverse and assign
        ListNode dummy1=headA;
        ListNode dummy2=headB;

        while(dummy1 !=dummy2){

            //using terary operator to check whether the nodes have reached null,
            // if yes then we interchange
            dummy1=dummy1==null? headB:dummy1.next;
            dummy2=dummy2==null?headA:dummy2.next;
        }
        return dummy1;
    }

}
