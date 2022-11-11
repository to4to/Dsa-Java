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

    public  void traverse(){


        Node temp=head;
        if(head==null){
            System.out.println("No Element in List");
        }else {
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
public void insert(){
        int data,n,m,pos;
        do {
            System.out.println("Enter Data");
            data=sc.nextInt();

            Node new_node=new Node(data);
            if (head==null){
                head=new_node;
                tail=new_node;
            }else {
                System.out.println("1 for Begning ,2 For End & 3 for Specific position");
                m=sc.nextInt();
                switch (m){

                    case 1:
                        new_node.next=head;
                        head.prev=new_node;
                        head=new_node;
                        break;

                    case 2:
                        tail.next=new_node;
                        new_node.prev=tail;
                        tail=new_node;
                        break;

                    case 3:
                        System.out.println("Ente Position ");
                        pos=sc.nextInt();

                        Node temp1=head;
                        Node ptr=temp1.next;

                        for (int i=1;i<(pos-1);i++){


                            temp1=ptr;
                            ptr=ptr.next;
                        }
                        new_node.prev=temp1;
                        new_node.next=ptr;
                        temp1.next=new_node;
                        ptr.prev=new_node;
                        break;
                }
            }
            System.out.println("Press 1 to Continue");
            n= sc.nextInt();
        }while (n==1);
}


}
