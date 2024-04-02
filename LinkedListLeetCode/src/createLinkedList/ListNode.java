package createLinkedList;

public class ListNode {

    public int val;
    public ListNode next;

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
