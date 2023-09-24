import java.util.Scanner;

import List.*;


public class Main
{
    public static void main(String[] args)
    {
        boolean check = false;

        // SinglyLinkedList pList = new SinglyLinkedList();
        // pList.insertAtEnd(10);
        // pList.insertAtBeginning(20);
        // pList.show();
        
        while (check == false)
        {
            System.out.print("Press 1 to create a singly Linked List \nPress 2 to create a Doubly Linked List \n:");
            Scanner inp = new Scanner(System.in);
            int ch = inp.nextInt();

            if (ch == 1) 
            {
                SinglyLinkedList sList = new SinglyLinkedList();
                check = true;
            } 
            else if (ch == 2) 
            {
                DoublyLinkedList dList = new DoublyLinkedList();
                check = true;
                
            } 
            else 
            {
                System.out.println("Enter a valid choice");
                check = false;
            }

        }
        
        
        do {
            System.out.println(
                        "Press  0 to Display the List \nPress  1 to Insert at Beginning \nPress  2 to Insert at End  \nPress  3 to Insert at Middle \nPress  4 to Delete from Beginning \nPress  5 to Delete from End \nPress  6 to Delete From Middle \nPress  7 to Sort the list \nPress  8 to Search an element in the list \nPress  9 to Reverse the list \nPress 10 to get the length of the list \n:");

            Scanner temp = new Scanner(System.in);
            int ch1 = temp.nextInt();
            
            

        } while (false);

        
    }
    
}