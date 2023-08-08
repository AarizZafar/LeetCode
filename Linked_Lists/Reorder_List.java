package Linked_Lists;

public class Reorder_List {

    public class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    ListNode head;

    // ------------------------------------------------
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) 
            return;
        
        // Find the middle node of the list
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        
        // Reverse the second half of the list
        ListNode secondList = reverseList(slow.next);
        slow.next = null;

        ListNode Node1 = head;
        ListNode Node2 = secondList;

        while(Node2 != null){
            ListNode nextNode1 = Node1.next;
            ListNode nextNode2 = Node2.next;
            Node1.next = Node2;
            Node2.next = nextNode1;
            Node1 = nextNode1;
            Node2 = nextNode2;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;
        while(currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
    
    // ------------------------------------------------

    public ListNode addLast(int vals[]){
        ListNode newNode;
        newNode = new ListNode(vals[0]);

        if(head == null){
            head = newNode;
        }
        for(int i=1;i<vals.length;i++){
            ListNode newNode1 = new ListNode(vals[i]);

            ListNode currNode = head;
            while(currNode.next != null)
                currNode = currNode.next;
            currNode.next = newNode1;
        }
        return head;
    }

    public static void printList(ListNode head){
        if(head == null){
            System.out.println("The list is empty ");
            return;
        }
        ListNode currNode = head;
        while(currNode != null ){
            System.out.print(currNode.val + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null ");
    }

    public static void main(String[] args){
        Reorder_List test1 = new Reorder_List();
        int[] array = {1,2,3,4,5};
        ListNode l1 = test1.addLast(array);
        printList(l1);

        test1.reorderList(l1);
        printList(l1);
    }
}
