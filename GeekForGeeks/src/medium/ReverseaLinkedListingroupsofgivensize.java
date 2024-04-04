package medium;

import root.LinkedListMethods;
import root.Node;

public class ReverseaLinkedListingroupsofgivensize {

    //static int arr[]={1,2,3,4,5,6,7,8,9,10};
    static int arr[]={1,2,3,4,5};
    static Node list= LinkedListMethods.convertArrayToList(arr);

    public static void main(String args[]){
        int k=3;
        list=reverse(list,k);
        System.out.println(list.toString());
    }

    private static Node reverse(Node head, int k) {

        Node curr=head;
        Node prev=null;
        Node front=null;
        int c=0;

        while(curr!=null && c<k){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
            c++;
        }
        if(front!=null){
            head.next=reverse(front,k);
        }
        return prev;
    }
}
