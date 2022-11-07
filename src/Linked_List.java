import java.util.Scanner;

public class Linked_List {
Scanner sc=new Scanner(System.in);
    class Node{
        int data;
          Node next;
        Node(int _data){
             this.data=_data;
             this.next=null;
        }
    }
    Node head=null;


     public void  create(){

          int data,n;
          do {
              System.out.println("Enter Data");
               data = sc.nextInt();

              Node new_node = new Node(data);

              if (head == null) {
                  head = new_node;
              } else {
                  new_node.next = head;  //inserting in begning
                  head = new_node;
              }
              System.out.println("Enter 1 To continue");
              n=sc.nextInt();
          }while (n==1);
        }

        public void traversal(){

            Node temp=head;
            while (temp.next!=null){
                System.out.println(temp.data);
            }

        }

        public void insertion(){

            System.out.println("Enter Data");
            int data=sc.nextInt();
        Node new_node=new Node(data);
         int choice;
         System.out.println("1 For Front 2 For End 3 For Specific Position");
         choice=sc.nextInt();

         switch (choice){
             case 1:
                 new_node.next=head;
                 head=new_node;
                 break;

             case 2:
                 Node temp=head;
                while (temp!=null){
                    temp=temp.next;
                }
                 temp.next=new_node;
                break;

             case 3:
                 System.out.println("Enter Poaition");
                 int pos= sc.nextInt();

                 Node temp1=head;
                 for (int i=0;i<(pos-1);i++){
                    temp1=  temp1.next;
                 }

                 new_node.next=temp1.next;
                 temp1.next=new_node;
                 break;

         }

        }

        public void delete(){
         int n,pos;
         do{
             if (head==null){
                 System.out.println("List empty");
             }else {
                 System.out.println("1 For Front 2 For End 3 For Specific Position");
                 pos=sc.nextInt();

                 switch (pos){
                     case 1:
                         Node temp=head;
                         temp=temp.next;
                         head=temp;
                         break;
                     case 2:
                         Node temp1=head;
                         Node ptr=temp1.next;
                         while (ptr.next!=null){
                             temp1=ptr;
                             ptr=ptr.next;

                         }
                         temp1.next=null;
                         break;

                     case 3:
                         System.out.println("Enter Position");
                         pos=sc.nextInt();
                         Node temp2=head;
                         Node ptr1=temp2.next;
                         for (int i=0;i<(pos-1);i++){
                             temp2=ptr1;
                             ptr1=ptr1.next;
                         }
                         temp2.next=ptr1.next;
                         break;

                 }

             }

             System.out.println("Enter 1 to Delete More");
             n= sc.nextInt();;

         }while (n==1);


        }

        public static void main(String R[]){
         Linked_List LL=new Linked_List();
         LL.create();
         LL.insertion();
         LL.traversal();
         LL.delete();

        }


}
