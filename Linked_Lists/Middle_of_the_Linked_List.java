package Linked_Lists;

public class Middle_of_the_Linked_List{
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    
    ListNode head;
// ----------------------------------------------------------------
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
// ----------------------------------------------------------------

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

    public void printList(){
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

    public static void main(String[] args) {
        Middle_of_the_Linked_List list1 = new Middle_of_the_Linked_List();
        int[] vals = {1,2,3,4,5,6};
        ListNode l1 = list1.addLast(vals);
        list1.printList();

        System.out.println(list1.middleNode(l1).val);
    }


}