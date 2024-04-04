package createLinkedList;

public class CreateListWithRandomPointer {

    public static Node randomList(){
        Node list=new Node(7);
        Node list2=new Node(13);
        Node list3=new Node(11);
        Node list4=new Node(10);
        Node list5=new Node(1);

        Node temp=list;


        temp.next=list2;
        temp=temp.next;
        Node temp2=temp;
        temp2.random=list;

        temp.next=list3;
        temp=temp.next;
        Node temp3=temp;
        temp3.random=list5;

        temp.next=list3;
        temp=temp.next;
        Node temp4=temp;
        temp4.random=list5;


        temp.next=list4;
        temp=temp.next;
        Node temp5=temp;
        temp5.random=list3;


        temp.next=list5;
        Node temp6=temp;
        temp6.random=list;

        return list;
    }
}
