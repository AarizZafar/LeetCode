package Linked_Lists;

public class Swap_Nodes_in_Pairs {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    ListNode head;
    // -------------------------------------------------------
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode Node1 = head;
        ListNode Node2 = head.next;
        ListNode pointNode = head;

        if(Node2 != null)              // Making node 2 as head as it will come to position 1 
            head = Node2;

        while(Node2 != null){
            if(pointNode != Node1)     // The previous Node has to point towards the dangling node after the swap
                pointNode.next = Node2;

            Node1.next = Node2.next;
            Node2.next = Node1;

            pointNode = Node1;    
            Node1 = Node1.next;

            if(Node1 == null)          // This condition will occour when there are even number of nodes
                break;

            Node2 = Node1.next;
        }
        return head;
    }
    // -------------------------------------------------------

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

    public void printList(ListNode startNode){
        if(startNode == null){
            System.out.println("The list is empty ");
            return;
        }
        ListNode currNode = startNode;
        while(currNode != null ){
            System.out.print(currNode.val + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null ");
    }

    public static void main(String[] args) {
        Swap_Nodes_in_Pairs list1 = new Swap_Nodes_in_Pairs();
        int[] vals = {1,2,3,4};
        ListNode l1 = list1.addLast(vals);
        list1.printList(l1);

        ListNode l2 = list1.swapPairs(l1);
        list1.printList(l2);
        
    }
    
}
