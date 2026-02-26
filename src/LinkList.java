class node{
    char data;
    node next;

    public node(char data){
        this.data=data;
        this.next=null;
    }
}
public class LinkList {
    node head = null;
    node last = null;
    public void insert(char data){
        node newnode= new node(data);
        if(head==null){
            head=last= newnode;
        } else {
            last.next=newnode;
            last=newnode;
        }
    }
    public void initialize(String word){
        for(char i:word.toCharArray()) {
            insert(i);
        }
    }
    public node reverse(node head) {
        // 1. Base case: If list is empty or has only one node, it's already reversed
        if (head == null || head.next == null) {
            return head;
        }
        node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public boolean isPalindrome() {
        if (head == null || head.next == null) return true;

        // 1. Find the middle of the list (Slow/Fast pointer)
        node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the second half
        node secondHalf = reverse(slow);
        node firstHalf = head;

        // 3. Compare data in both halves
        node temp = secondHalf;
        while (temp != null) {
            if (firstHalf.data != temp.data) return false;
            firstHalf = firstHalf.next;
            temp = temp.next;
        }
        return true;
    }
}
