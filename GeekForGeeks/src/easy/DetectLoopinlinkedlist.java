package easy;

import root.LinkedListMethods;
import root.Node;

public class DetectLoopinlinkedlist {

    static int arr[]={1,2,3};
    static Node list= LinkedListMethods.convertArrayToList(arr);

    public static void main(String args[]){
        boolean ans=detectLoop(list);
        System.out.println(ans);
    }

    private static boolean detectLoop(Node head) {
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            if(slow==fast)
                return true;
            fast=fast.next.next;
            slow=slow.next;
        }
        return false;
    }
}
