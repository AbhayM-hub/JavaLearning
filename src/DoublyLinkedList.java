import java.util.Scanner;

public class DoublyLinkedList {
   public static Scanner sc =new Scanner(System.in);
   public static NodeD head,tail;

   public static NodeD makeList(){
       head =null;
       tail =null;
       System.out.println("Enter the data in the List : ");
       int data= sc.nextInt();
       while (data!=-1){
           NodeD newNodeD = new NodeD(data);
           if(head == null){
               head =newNodeD;
               tail = newNodeD;
               newNodeD.next =null;
               newNodeD.previous =null;

           }else{
               tail.next =newNodeD;
               newNodeD.previous =tail;
               tail =newNodeD;
               tail.next =null;
           }
           data = sc.nextInt();
       }
       return head;
   }

   public static void printList(NodeD head){
       System.out.println("Elements in the list are : ");
       while (head!=null){
           System.out.print(head.data+" ");
           head =head.next;
       }
       System.out.println();
   }
   public static void length(NodeD head){
       int count =0;
       while (head!=null){
           count++;
           head =head.next;
       }
       System.out.println("The length of the list is : "+count);
   }
   //Insert at beg
   public static NodeD insertAtBeg(NodeD head){
       System.out.println("Enter the data to insert ");
       int data = sc.nextInt();
       NodeD newNodeD = new NodeD(data);
       if(head == null && tail == null){
           head=tail =newNodeD;
       }else{
           head.previous = newNodeD;
           newNodeD.next =head;
           head = newNodeD;
           newNodeD.previous =null;
       }
       return head;
   }
   public static NodeD insertAtEnd(NodeD head){

       System.out.println("Enter the data to insert at end");
       int data = sc.nextInt();
       NodeD newNodeD = new NodeD(data);
       if(head ==null & tail ==null){
           head = tail =newNodeD;
   }else {
           tail.next = newNodeD;
           newNodeD.previous = tail;
           newNodeD.next =null;

       }
       return head;
   }
   //Insert at position
    public static NodeD insertAtSpeci(NodeD head){
       int position,count = 1;
        System.out.println("Enter the data ");
        int data =sc.nextInt();
        System.out.println("Enter the position");
        position =sc.nextInt();
        NodeD newNodeD= new NodeD(data);
        if(position == 1){
            head.previous = newNodeD;
            newNodeD.next =head;
            head =newNodeD;
            newNodeD.previous =null;
        }else{
            NodeD temp =head;
            NodeD temp2=null;
            while (count<position-1){
                temp =temp.next;
                count++;
            }
            if (temp.next==null){
                temp.next =newNodeD;
                newNodeD.previous =temp;
            }else {
                 temp2 = temp.next ;
                 temp.next=newNodeD;
                 newNodeD.next =temp2;
                 newNodeD.previous =temp;
            }
        }
        return head;
    }

    //delete at begin
    public static NodeD deletaAtBegining(NodeD head){
       NodeD temp = head;
       if(head == tail){
           tail =head =null;
       }else {
           head.next.previous =null;
       }
       head =head.next;
       temp.next =null;
       return head;


    }
    //Delete the end code

    public static NodeD deleteAtEnd(NodeD head){
       NodeD temp =head;
       if(head ==tail){
           head=null;
       }
       else{
           tail.previous.next =null;
       }
       tail =tail.previous;
       temp.previous =null;

       return head;
    }

    //Delete at position
    public static NodeD deleteAtSpe(NodeD head){
       int position,count = 1;
       NodeD temp =head;
        System.out.println("Enter the position of node you want to delete");
        position =sc.nextInt();
        if(position==1){
            if(head.next ==null){
                head=tail =null;

            }else{
                head.next.previous =null;
                head =head.next;
                temp.next =null;

            }
        }else {
            NodeD back =head;
            while (count<position-1){
                back =back.next;
                count++;
            }
            NodeD current =back.next;
            if (current.next ==null){
                current.previous =null;
                back.next =null;
            }
            else {
                back.next = current.next;
                current.next.previous=back;

            }
        }
        return head;

    }


    public static void main(String[] args) {
        NodeD head =makeList();
        printList(head);
//        length(head);
//        NodeD head1 =insertAtBeg(head);
//        printList(head1);
//           NodeD head1 =insertAtEnd(head);
//           printList(head1);

//

//        NodeD newHead = deletaAtBegining(head);
//        printList(newHead);
//        length(newHead);

//        NodeD newNode = deleteAtEnd(head);
//        printList(newNode);
//        length(newNode);

        NodeD newHead = deleteAtSpe(head);
        printList(newHead);
        length(newHead);

    }


}
