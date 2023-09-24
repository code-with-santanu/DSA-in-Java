package ListNode;

public class SinglyListNode 
{
    private int data;
    public SinglyListNode next;

    public SinglyListNode() //constructor
    {
        this.next = null;
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
