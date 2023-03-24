package Generics_CollectionFrameWork;

import java.util.Stack;

public class StackGenerics {

    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(100);
          stk.push(200);
            stk.push(300);
              stk.push(400);
                stk.push(500);


                          stk.addElement(22);
                          stk.capacity();
                            stk.clone();
                                stk.contains(100);
                                    stk.contains(1000);
                                    stk.empty();
                                        stk.elementAt(2);
                                        stk.firstElement();
                                            stk.lastElement();
                                            stk.get(2);
                                                stk.hashCode();
                                                stk.indexOf(100);
                                                    stk.indexOf(1000);
                                                    stk.insertElementAt(1000, 2);
                                                        stk.isEmpty();
                                                        stk.lastIndexOf(100);
                                                            stk.lastIndexOf(1000);
                                                            stk.peek();
                                                                stk.pop();
                                                                stk.push(1000);
                                                                    stk.remove(2);
                                                                    stk.removeElement(1000);
                                                                        stk.removeElementAt(2);

                                                                            stk.search(100);
                                                                            stk.search(1000);
                                                                                stk.setSize(10);
                                                                                stk.set(2, 1000);
                                                                                    stk.size();
                                                                                    stk.subList(2, 4);
                                                                                        stk.toArray();
                                                                                        stk.toString();

        System.out.println(stk.peek());

        System.out.println(stk.pop());

        System.out.println(stk.empty());

        System.out.println(stk.search(100));

        System.out.println(stk.search(1000));

        System.out.println(stk.search(100));


    }





}
