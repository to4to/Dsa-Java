import java.util.Scanner;

public class Doubly_LL {


Scanner sc= new Scanner(System.in);
    class Node{
        int data;

        Node prev;
        Node next;
        Node(int _data){
            this.data=_data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;

    public void creation(){
        int data,n;

        do {

            System.out.println("Enter Data");
            data= sc.nextInt();

            Node new_node=new Node(data);
            if(head==null){
                head=new_node;
                tail=new_node;
            }else{



                head.prev=new_node;
                new_node.next=head;
                head=new_node;

            }
            System.out.println("To Continue press 1");
            n=sc.nextInt();

        }while(n==1);

    }


}
