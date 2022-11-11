import java.util.Scanner;

public class Circular_LL {
    Scanner sc=new Scanner(System.in);
    public class Node{
        int data;
        Node next;
        Node(int _data){
            this.data=_data;
            this.next=null;
        }
    }

    Node head;
    Node tail;


    public void creation(){
        int data,n;

        do{

            System.out.println("Enter Data");
            data=sc.nextInt();
            Node new_node=new Node(data);
            if(head==null){
                head=new_node;
                tail=new_node;
            }else{
                //inserting in begning
                new_node.next=head;
                head=new_node;
               tail.next=head;


               /*   //tail will point to new node.
                tail.next = newNode;
                //New node will become new tail.
                tail = newNode;
                //Since, it is circular linked list tail will point to head.
                tail.next = head;*/
            }

            System.out.println("Enter 1 to Continue");
            n= sc.nextInt();


        }while (n==1);
    }
    public  void traverse(){
        Node temp=head;

        if(head==null){
            System.out.println("Circular LL Empty");
        }else{
            do{
                System.out.println(temp.data);
                temp=temp.next;


            }while(temp!=head);


        }


    }


    public static  void main(String R[]){

        Circular_LL circular_ll=new Circular_LL();
circular_ll.creation();
circular_ll.traverse();



    }



}
