package linked_list;

class ListNode {
    int data;
    ListNode next;
    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlisttraversal {
    ListNode head;

    // Corrected method to add a node at the beginning
    void beginningadd(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to add a node at the end (for dynamic input)
    void add(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void traversal() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" --> ");
            }
            temp = temp.next;
        }
        System.out.println(" --> Null");
    }
    void insert(int data,int position){
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        else if (position == 0) {
            beginningadd(data);
            return;
        }
        ListNode newNode = new ListNode(data);
        ListNode temp = head;   
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Inserted " + data + " at position " + position);

    }
}

public class Linked_list {
    public static void main(String[] args) {
        Linkedlisttraversal ob = new Linkedlisttraversal();

        ob.beginningadd(10);
        ob.beginningadd(20);        
        ob.add( 30);
        ob.add(40);
        ob.insert(25, 1); // Insert 25 at position 1
        ob.traversal(); // Display the list after insertio
    }
}