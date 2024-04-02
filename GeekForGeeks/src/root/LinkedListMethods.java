package root;

public class LinkedListMethods {

    public static Node convertArrayToList(int arr[]){
        Node head=new Node(arr[0]);
        Node temp=head;

        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }

        return head;
    }
}
