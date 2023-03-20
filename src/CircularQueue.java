import java.util.Scanner;

public class CircularQueue {
   static int f=-1,r=-1;
 static    int n=10;
static Scanner sc=new Scanner(System.in);
    static int[] queue=new int[n];

   static void enqueue(int _data){
        if(f==(r+1)%n){
            System.out.println("OverFlow");
        }else if (f==-1 && r==-1){
            f++;
            r++;
            queue[r]=_data;
        }else{
            r=(r+1)%n;
            queue[r]=_data;
        }
    }




   static void dequeue(){

        if(f==-1&&r==-1 || f==r){
            System.out.println("UnderFlow");
        }else{
            f=(f+1)%n;
        }
    }


 static void dispaly(){

for(int i=f;i!=r;i=(i+1)%n){
    System.out.println(queue[i]);
}
}

    public static void main(String[] args) {
        System.out.println("1:Enqueue\n2:Dequeue\n3:Display");
        int choice=sc.nextInt();

        switch (choice){
            case 1->{
                System.out.println("Enter Data");
            int data=sc.nextInt();
            enqueue(data);
            }
            case 2->dequeue();
            case 3->dispaly();
            default -> System.out.println("Wrong Input");


        }


    }


}
