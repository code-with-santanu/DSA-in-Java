package ListNode;

public class DoublyListNode 
{
    private int data;
    public DoublyListNode next;
    public DoublyListNode prev;

    public DoublyListNode() //constructor
    {
        this.next = null;
        this.prev = null;
    }


    public void  setValue(int n)
    {
        this.data = n;
    }

    public int  getValue()
    {
        return this.data;
    }
}
