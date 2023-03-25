package Generics_CollectionFrameWork;

import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList<>();

        list.add(22);
        list.add(33);
        list.add(44);

        list.addFirst(11);
        list.addLast(55);
        list.add(2,66);
        list.contains(22);
        list.get(2);
        list.indexOf(22);
        list.lastIndexOf(22);
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        list.set(2, 100);
        list.size();
        list.toArray();
        list.toString();
        list.clone();
        list.clear();
        list.element();
        list.getFirst();
        list.getLast();
        list.peek();
        list.peekFirst();
        list.peekLast();
        list.poll();
        list.pollFirst();
        list.pollLast();
        list.pop();
        list.push(100);
        list.offer(100);
        list.offerFirst(100);
        list.offerLast(100);
        list.remove();
        list.removeFirst();
        list.removeLast();
        list.removeFirstOccurrence(100);
        list.removeLastOccurrence(100);
        list.subList(2, 4);
        list.toArray();
        list.toString();

        System.out.println(list);





    }




}
