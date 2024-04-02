package easy;

import root.LinkedListMethods;
import root.Node;

public class ReverseALinkedList {

    static int arr[]={1,2,3,4,5,6};
    static Node list= LinkedListMethods.convertArrayToList(arr);

    public static void main(String args[]){
        list=reverseList(list);
        System.out.println(list.toString());
    }

    private static Node reverseList(Node head) {
        if(head==null || head.next==null)
            return head;

        Node curr=head;
        Node prev=null;
        Node front=null;

        while(curr!=null){

            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
}
