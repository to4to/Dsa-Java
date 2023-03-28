package Generics_CollectionFrameWork;


import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {

        HashSet<Integer> set= new HashSet<Integer>();

        set.add(11);
           set.add(22);
           set.add(44);
           set.add(33);

           set.contains(22);
           set.size();
           set.remove(44);
        set.isEmpty();
        set.size();
        set.toArray();
        set.toString();
        set.clone();
        //set.clear();
        set.hashCode();
          set.equals(set);
            set.iterator();
            set.stream();
            set.parallelStream();
            set.spliterator();



    }




}
