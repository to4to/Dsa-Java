package Generics_CollectionFrameWork;

import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10);
        for(int i:list){
            System.out.println(i);
        }

        ListIterator<Integer> listIterator=list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }

}
