package Linked_Lists;

public class Merging_two_sorted_linked_list {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    ListNode head;

    // =============================================================
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        ListNode newL = new ListNode(0);
        ListNode newList = newL;

        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                // System.out.println("l1 : " + list1.val);
                newList.next = list1;
                newList = newList.next;
                list1 = list1.next;
            }
            else {
                // System.out.println("l2 : " + list2.val);
                newList.next = list2;
                newList = newList.next;
                list2 = list2.next;
            }
        }

        if(list1 == null)
            newList.next = list2;
        if(list2 == null)
            newList.next = list1;

        return newL.next;
    }
    // =============================================================
    public ListNode addLast(int[] array) {
        if(array.length == 0)
            return null;
            
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

    public static void main(String[] args) {
        Merging_two_sorted_linked_list test1 = new Merging_two_sorted_linked_list();
        int[] array1 = {1};
        int[] array2 = {1,3,4};

        ListNode l1 = test1.addLast(array1);
        ListNode l2 = test1.addLast(array2);

        printList(l1);
        printList(l2);

        printList(test1.mergeTwoLists(l1, l2));
    }
}
