package Generics_CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;


public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //Adding Data
        list.add(22);
        list.add(33);

        //Adding At Required Index
        list.add(1,44);

        //Getting Element At Index
        list.get(2);

        //sets data at given index
        list.set(2,66);

       List list1= List.of(2,3,4,5);
        list.addAll(list1);//Adds Whole Collection

        list.size();//Gives Length Of Array


        list.contains(22);//Checks If Element Is Present Or Not

        System.out.println("For Each Starts");
        list.forEach(System.out::println);//Prints All Elements


    }
}
