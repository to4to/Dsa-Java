import java.util.Scanner;

public class StackwithArray {
    static int top=-1;
    static int size=40;//you can change limit as per oyur need
    static int[] stack =new int[size];


    static void push(int _data) {

        if (top == (size - 1)) {
            System.out.println("OverFlow: stack Full");
        } else {
            System.out.println("Enter Data");
            top += 1;
            stack[top] = _data;
        }

    }

    static void pop(){

        if(top==-1){
            System.out.println("UnderFlow : Stack Empty");
        }else{

            top-=1;
            System.out.println("Data Poped :)");
        }
    }
    static void display(){
        if(top==-1){
            System.out.println("Stack Empty");
        }else{

            while(top>=0){
                System.out.println(stack[top]);
                top--;
            }
        }


    }
}

void Test();
class Stack extends StackwithArray{
    public static void main(String[] args) {

        System.out.println("1:Push \n 2: Pop\n 3: Display");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        int data;
        switch (choice) {
            case 1 -> {
                data = sc.nextInt();
                push(data);
            }
            case 2 -> pop();
            case 3 -> display();
            default -> System.out.println("U Entered Wrong Choice");
        }


    }


}
