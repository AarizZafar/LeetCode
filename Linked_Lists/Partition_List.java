package Linked_Lists;

public class Partition_List {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    ListNode head;

    // -----------------------------------------------------------------

    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode greater = new ListNode(0);

        ListNode lessVals = less;
        ListNode greaterVals = greater;

        ListNode currNode = head;

        while(currNode != null){
            if(currNode.val < x) {
                lessVals.next = currNode;
                lessVals = lessVals.next;
            }
            else {
                greaterVals.next = currNode;
                greaterVals = greaterVals.next;
            }
            currNode = currNode.next;
        }
        lessVals.next = greater.next;
        greaterVals.next = null;

        return less.next;
    }
    // ----------------------------------------------------------------

    public ListNode addLast(int[] array) {
        ListNode firstNode = new ListNode(array[0]);

        head = firstNode;
        for(int i=1;i<array.length;i++){
            ListNode newNode = new ListNode(array[i]);
            ListNode currNode = head;

            while(currNode.next != null)
                currNode = currNode.next;

            currNode.next = newNode;
        }
        return head;
    }

    public static void printList(ListNode head){
        ListNode currNode = head;
        while(currNode != null){
            System.out.print(currNode.val + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        Partition_List test1 = new Partition_List();
        int[] array = {2,1};
        int target = 2;
        
        ListNode l1 = test1.addLast(array);

        printList(l1);

        ListNode l2 = test1.partition(l1, target);
        printList(l2);
    }
}


/*
 * creating 2 ListNodes 1) smaller values than the target , 2) greater than or equal to the values of the target
 * Traversing the LinkedList that values that are smalller than the target will go into the lessVals linked list,
 * values that are larger or equal to the target will go into the  larger linked list 
 */
