package medium;

import createLinkedList.CreateListWithRandomPointer;
import createLinkedList.Node;

public class CopyListwithRandomPointer {

    public static void main(String args[]){

    Node head= CreateListWithRandomPointer.randomList();
    Node copy=copyRandomList(head);
    System.out.println(head.toString());
    }

    private static Node copyRandomList(Node head) {
        Node temp=head;

        //create the new nodes and place it in between the existing pointer
        while(temp!=null){
            Node newNode=new Node(temp.val);
            newNode.next=temp.next;
            temp.next=newNode;
            temp=temp.next.next;
        }
        temp=head;

        //connecting random pointer
        while(temp!=null){
         Node copy=temp.next;
         if(temp.random!=null) {
             copy.random = temp.random.next;
         }else{
             copy.random=null;
         }
         temp=temp.next.next;
        }

        temp=head;
        Node dummy=new Node(-1);
        Node result=dummy;

        //now connecting next pointers and linking them together
        while(temp!=null){
            result.next=temp.next;
            temp.next=temp.next.next;
            result=result.next;
            temp=temp.next;
        }

        return dummy.next;
    }
}
