import java.util.Scanner;

public class QueuewithArray {
    static Scanner sc=new Scanner(System.in);
    static int f=-1;
    static int r=-1;
    static int size=20;

    static int[] q =new int[size];
   static void enqueue(){
        if(r==(size-1)){
            System.out.println("OverFlow");
        }else if(f==-1 && r==-1){
            System.out.println("Enter Data");
            int data= sc.nextInt();
            r++;f++;
            q[r]=data;
        }
        else
        {
            System.out.println("enter Data");
            int data=sc.nextInt();
            r++;
            q[r]=data;


        }


    }


    static void dequeue(){

        if(f==-1){
            System.out.println("UnderFlow");
        }else{
            System.out.println("Data Dequeued");
            f++;
        }
    }

    static void display(){

        for (int i=f;i<r;i++){
            System.out.println(q[f]);
        }
    }

    public static void main(String[] args) {
        System.out.println("1: Enqueue \n 2:Dequeue \n 3: Display");
        int choice=sc.nextInt();
        switch (choice){
            case 1-> enqueue();
            case 2-> dequeue();
            case 3-> display();

        }
    }

}
