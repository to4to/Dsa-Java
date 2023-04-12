package Generics_CollectionFrameWork;

import java.util.Set;

public class TreeSet {

    public static void main(String[] args) {

        Set<Integer> treeSet=new java.util.TreeSet<>();
        treeSet.add(2);
        treeSet.add(1);

        treeSet.add(3);

        treeSet.add(4);
        treeSet.add(5);
        treeSet.addAll(treeSet);
        treeSet.equals(3);
        treeSet.remove(3);
        treeSet.removeAll(treeSet);
        treeSet.retainAll(treeSet);
        treeSet.size();
        treeSet.clear();
        treeSet.isEmpty();
    treeSet.contains(3);
    treeSet.containsAll(treeSet);
    treeSet.hashCode();
    treeSet.iterator();
    treeSet.toArray();
    treeSet.toArray(new Integer[0]);
    treeSet.toString();

    treeSet.notify();
    treeSet.notifyAll();



    //recursion method to print the treeSet elements

    public static void print(Set<Integer> treeSet){
        if(treeSet.isEmpty()){
            return;
        }
        else{
            System.out.println(treeSet);
            print(treeSet);
        }

    }


    void twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println("[" + map.get(complement) + "," + i + "]");
            }
            map.put(nums[i], i);
        }
    }

    }



}
