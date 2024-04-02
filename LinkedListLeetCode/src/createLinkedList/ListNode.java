package createLinkedList;

public class ListNode {

    int val;
    ListNode next;

    public ListNode() {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
        this.next=null;
    }

    @Override
    public String toString() {
        return
                "{ val=" + val +
                "-> next=" + next +
                '}';
    }
}
