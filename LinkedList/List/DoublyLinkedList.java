package List;

import ListNode.DoublyListNode;

public class DoublyLinkedList 
{
    private DoublyListNode head;
    private int length;

    public DoublyLinkedList() 
    {
        this.head = null;
        this.length = 0;
    }

    public void show() 
    {
        DoublyListNode cur;
        cur = head;

        while (cur.next != null) {
            System.out.print(cur.getValue());

            if (cur.next != null)
                System.out.print(" -> ");
            else
                System.out.println();

            cur = cur.next;
        }

        while (cur != null) {
            System.out.print(cur.getValue());

            if (cur.prev != null)
                System.out.print(" <- ");
            else
                System.out.println();

            cur = cur.prev;
        }


    }

    public int getLength()
    {
        return this.length;
    }
    
    public void insertAtEnd(int value) 
    {
        DoublyListNode temp = new DoublyListNode();
        temp.setValue(value);
        DoublyListNode cur = head;

        if (head == null) 
        {
            head = cur = temp;
        } 
        else 
        {
            cur = head;
            while (cur.next != null) 
            {
                cur = cur.next;
            }
            temp.prev = cur;
            cur.next = temp;
        }

        this.length++;
    }
    
    public void insertAtBeginning(int value)
    {
        DoublyListNode temp = new DoublyListNode();
        temp.setValue(value);

        if (head == null) {
            head = temp;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;

        this.length++;

    }
    
    public void insertAtMiddle(int afterNo , int value)
    {
        DoublyListNode temp = new DoublyListNode();
        temp.setValue(value);

        DoublyListNode cur = head;

        while (cur.getValue() != afterNo) {
            cur = cur.next;
        }

        temp.next = cur.next;
        temp.prev = cur;
        cur.next.prev = temp;
        cur.next = temp;

        this.length++;
    }
    
    public int DeleteFromEnd()
    {
        DoublyListNode cur = head;

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
        head.prev = null;

        this.length--;
        return value;
    }

    public void DeleteFromMiddle(int value)
    {
        DoublyListNode cur;

        cur = head;

        while (cur.next.getValue() != value) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        cur.next.prev = cur;

        this.length--;

    }
    
    public void Search(int value)
    {
        DoublyListNode cur = head;
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
        DoublyListNode current, cur = null;

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
    
    // public void Reverse()
    // {
    //     DoublyListNode current, previous, sprevious;
    //     current = head;
    //     previous = sprevious = null;

    //     while (current != null)
    //     {
    //         sprevious = previous;
    //         previous = current;
    //         current = current.next;
    //         previous.next = sprevious;
    //         sprevious.prev = previous;
    //     }
    //     head = previous;
    // }
}
