package datastructures.arraylistnlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1_000_000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        // #################### LinkedList ###########################
        startTime = System.nanoTime();

        // do something.
//        linkedList.get(0);
//        linkedList.get(500_000);
        linkedList.get(999_999);

        linkedList.remove(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList: " + elapsedTime + " ns");

        // #################### ArrayList ###########################

        startTime = System.nanoTime();

        // do something.
//        arrayList.get(0);
//        arrayList.get(500_000);
        arrayList.get(999_999);
        arrayList.remove(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("arrayList: " + elapsedTime + " ns");


        // watch from 01.05.00 hrs - arraylist & linked lists.
    }
}
