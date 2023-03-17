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



    }
}
