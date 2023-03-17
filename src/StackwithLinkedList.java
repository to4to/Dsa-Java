import java.util.Scanner;

public  class StackwithLinkedList {

    static class Node{
        int data;
        Node next;



        Node(int data){
                  this.data=data;
                  this.next=null;

        }
    }

    static Node top=null;


    static void push(int data){

        Node new_node= new Node(data);

        if (top != null) {
            new_node.next = top;
            System.out.println("Item Inserted");
        }
        top=new_node;


    }


    static void pop(){
        if(top!=null){
            top=top.next;
            System.out.println("Item Poped");
        return;
        }
        System.out.println("Stack Empty: Under Flow ");

    }

    static void display(){

        while (top!=null){
            System.out.println(top.next);
        top=top.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1:Push\n 2:Pop\n3:Display ");
        int choice=sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Enter Data");
                int data = sc.nextInt();
                push(data);
                System.out.println("Data Pushed");
            }
            case 2 -> pop();
            case 3 -> display();
            default -> System.out.println("Wrong Number Entered");
        }



    }


}
