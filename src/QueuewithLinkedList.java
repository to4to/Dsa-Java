import java.util.Scanner;

public class QueuewithLinkedList {

    static Scanner sc=new Scanner(System.in);
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static  Node front=null;
    static   Node rear=null;

  public static  void enqueue(){
        System.out.println("Enter Your Data");
int data=sc.nextInt();
        Node new_node=new Node(data);

        if(front==null && rear ==null){
            front=rear=new_node;
        }else{
            rear.next=new_node;
            rear=new_node;
        }


    }


   public static  void dequeue(){

        if(front==null){
            System.out.println("UnderFlow: Queue Empty");
        }else {

            front=front.next;
        }
}



  public static void display(){
        Node temp=front;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
}


    public static void main(String[] args) {
        System.out.println("1:Enqueue \n 2:Dequeue\n 3:Display");
        int choice=sc.nextInt();
        switch(choice){
            case 1-> enqueue();
            case 2-> dequeue();
            case 3-> display();
            default -> System.out.println("Wrong Choice");
        }
    }
}
