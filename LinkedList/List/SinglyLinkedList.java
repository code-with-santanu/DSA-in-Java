package List;

import ListNode.SinglyListNode;

public class SinglyLinkedList {
    
    private SinglyListNode head;
    private int length;
    

    public SinglyLinkedList() {
        this.head = null;
        this.length = 0;
    }


    public void show() {
        SinglyListNode cur;
        cur = head;

        while (cur != null) {
            System.out.print(cur.getValue());

            if (cur.next != null)
                System.out.print(" -> ");
            else
                System.out.println();

            cur = cur.next;
        }
    }

    public int getLength()
    {
        return this.length;
    }
    
    public void insertAtEnd(int value) 
    {
        SinglyListNode temp = new SinglyListNode();
        temp.setValue(value);
        SinglyListNode cur = head;

        if (head == null) {
            head = cur = temp;
        } else {
            cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = temp;
        }

        this.length++;
    }
    
    public void insertAtBeginning(int value)
    {
        SinglyListNode temp = new SinglyListNode();
        temp.setValue(value);

        if (head == null) {
            head = temp;
        }
        temp.next = head;
        head = temp;

        this.length++;

    }
    
    public void insertAtMiddle(int afterNo , int value)
    {
        SinglyListNode temp = new SinglyListNode();
        temp.setValue(value);

        SinglyListNode cur = head;

        while (cur.getValue() != afterNo) {
            cur = cur.next;
        }

        temp.next = cur.next;
        cur.next = temp;

        this.length++;
    }
    
    public int DeleteFromEnd()
    {
        SinglyListNode cur = head;

        while (cur.next.next != null) {
            cur = cur.next;
        }
        int value = cur.next.getValue();
        cur.next = null;

        this.length--;

        return value;
    }
    
    public int DeleteFromBeginning()
    {
        int value;

        value = head.getValue();
        head = head.next;

        this.length--;
        return value;
    }

    public void DeleteFromMiddle(int value)
    {
        SinglyListNode cur;

        cur = head;

        while (cur.next.getValue() != value) {
            cur = cur.next;
        }
        cur.next = cur.next.next;

        this.length--;

    }
    
    public void Search(int value)
    {
        SinglyListNode cur = head;
        int count = 0;
        boolean found = false;

        while (cur != null) {
            if (cur.getValue() == value) {
                found = true;
                System.out.println("The no is in " + count + "th position in the list");

            }
            cur = cur.next;
            count++;
        }

        if (found == false)
            System.out.println("The required no is not in the list");

    }
    

    public void sort()
    {
        SinglyListNode current, cur = null;

        current = head;

        while (current.next != null) {
            cur = current.next;

            while (cur != null) {
                if (current.getValue() > cur.getValue()) {
                    int temp = current.getValue();
                    current.setValue(cur.getValue());
                    cur.setValue(temp);
                }
                cur = cur.next;
            }

            current = current.next;
        }
    }
    
    public void Reverse()
    {
        SinglyListNode current, prev, sprev;
        current = head;
        prev = sprev = null;

        while (current != null)
        {
            sprev = prev;
            prev = current;
            current = current.next;
            prev.next = sprev;
        }
        head = prev;
    }


}


