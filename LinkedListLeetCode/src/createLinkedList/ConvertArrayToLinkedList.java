package createLinkedList;

public class ConvertArrayToLinkedList {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        ListNode node=convertToList(arr);
        System.out.println(node.toString());
    }

    private static ListNode convertToList(int[] arr) {
        ListNode head=new ListNode(arr[0]);
        ListNode curr=head;
        for(int i=1;i<arr.length;i++){
            ListNode newNode=new ListNode(arr[i]);
            curr.next=newNode;
            curr=curr.next;
        }
        return head;
    }
}
