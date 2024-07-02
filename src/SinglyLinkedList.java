

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class SinglyLinkedList {
    public static Scanner sc =new Scanner(System.in);
    public static NodeS head,tail;

    //function to make the singlu linked list
    public static NodeS makeList(){
        head =null;
        tail = null;
        System.out.println("Enter the data in the list : ");
        int data =sc.nextInt();
        while (data!=-1){
            NodeS newNodeS = new NodeS(data);
            if (head ==null){
                head =newNodeS;
                tail =newNodeS;
            }
            else{
                tail.next = newNodeS;
                tail= newNodeS;
            }
            data =sc.nextInt();
        }
        return head;
    }
    public static void printList(NodeS head){
        System.out.println("Elements of the list are : ");
        while (head!=null){
            System.out.print(head.data+" ");
            head =head.next;
        }
        System.out.println();
    }
    public  static void length(NodeS head){
        int counter =0;
        while (head != null){
            counter++;
            head =head.next;
        }
        System.out.println("The length of lis is : "+counter);
    }
    public static void searchElement(NodeS head){
        System.out.println("ENter the data you want to search: ");
        int element = sc.nextInt();
        int place = 1;
        NodeS temp =head;
        while (temp!=null){
            if(element ==temp.data){
                System.out.println("ELement found at "+place+"th place in the list");
                return;
            }
            temp =temp.next;
            place++;

        }
        System.out.println("Element is not inside  the list ");
    }

    public static NodeS reverseList(NodeS head){
        NodeS current = head;
        NodeS previous = null, next =null;
        while (current!=null){
            next = current.next;
            current.next =previous;
            previous =current;
            current = next;
        }
        return previous;
    }
    public static  void middleNode(NodeS head){
        NodeS slowPtr =head;
        NodeS fastPtr = head;
        int count =1;
        while (fastPtr!= null && fastPtr.next!=null){
            slowPtr =slowPtr.next;
            fastPtr =fastPtr.next.next;
            count++;
        }
        System.out.println("Middle node of the list is "+slowPtr.data+" which is count at "+count+"th position in the list");
    }
    //Insert at begining
    //Head of the list
    //data for new node
    //make the new node
    //insert node in the list
    //return new head of the list
    public static NodeS insertAtBegining(NodeS head){
        System.out.println("ENter the data to insert the node in begining");
        int data =sc.nextInt();
        NodeS newNodeS =new NodeS(data);
        newNodeS.next =head;
        head =newNodeS;
        return head;

    }
    //Insert at the end
    // head of list
    //data of new node
    //create node
    //insert at end
    //return head
    public static NodeS insertAtEnd(NodeS head){
        System.out.println("Enter the data to insert at the ENd");
        int data = sc.nextInt();
        NodeS newNodeS = new NodeS(data);
        if(head == null){
            head =newNodeS;
        }
        else {
            tail.next =newNodeS;
            tail =newNodeS;
        }
        return head;
    }

    //insert operation at user specified location
    public static NodeS insertAtUserSpecificLocation(NodeS head){
        int position,count =1;
        System.out.println("Enter the data to insert at user specified location");
        int data = sc.nextInt();
        System.out.println("Enter the Position : ");
        position = sc.nextInt();
        NodeS newNodeS = new NodeS(data);
        if(position ==1){
            newNodeS.next =head;
            head =newNodeS;
        }else {
            NodeS previous =head;
            while (count < position -1){
                previous =previous.next;
                count++;

            }
            NodeS current = previous.next;
            newNodeS.next =current;
            previous.next =newNodeS;
        }
        return head;
    }
    // delete first node ffrom the begining
    public static NodeS deleteAtBegining(NodeS head){
        if (head== null){
            return null;
        }
        NodeS temp = head;
        head = head.next;
        temp.next =null;

        return head;
    }

    //delete at the end
    public static NodeS deleteAtEnd(NodeS head){
        if(head == null || head.next == null){
            return head;
        }
        NodeS previous =head;
        while(previous.next != tail){
            previous =previous.next;
        }
        tail =previous;
        previous.next =null;

        return head;

    }
    //delete at user specified location
    public static NodeS deleteAtSpe(NodeS head){
        int position,count=1;
        System.out.println("enter the position want to delete : ");
        position = sc.nextInt();
        if(position == 1){
            head =head.next;
        }
        else{
            NodeS previous =head;
            while (count<position -1){
                previous = previous.next;
                count++;
            }
            NodeS current = previous.next;
            previous.next =current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        NodeS head = makeList();
        printList(head);
//        length(head);
//        searchElement(head);
//       NodeS news =  reverseList(head);
//        printList(news);
//        middleNode(head);
//        head = insertAtEnd(head);
//        printList(head);
//        NodeS headNew =insertAtUserSpecificLocation(head);
//        printList(headNew);
//        NodeS delBeg = deleteAtBegining(head);
//        printList( delBeg);
//        NodeS delEnd = deleteAtEnd(head);
//        printList( delEnd);
        NodeS delspe = deleteAtSpe(head);
        printList( delspe);
    }
}
