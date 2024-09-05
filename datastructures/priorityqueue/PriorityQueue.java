package datastructures.priorityqueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {

    /*
    *   Priority Queue = A FIFO data structure that
    *   serves elements with the highest priorities
    *   first before elements with lower priority.
    *
    * */

    public static void main(String[] args) {
        // ##### NORMAL QUEUE BEHAVIOUR #####

        Queue<Double> queue = new LinkedList<>();
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("");
        // ##### PRIORITY QUEUE(DEFAULT - Least First) BEHAVIOUR #####

        Queue<Double> queue1 = new java.util.PriorityQueue<>();
        queue1.offer(3.0);
        queue1.offer(2.5);
        queue1.offer(4.0);
        queue1.offer(1.5);
        queue1.offer(2.0);

        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll()); // will print least number first in the order.
        }
        System.out.println("");

        // ##### PRIORITY QUEUE(Greatest First) BEHAVIOUR #####

        Queue<Double> queue2 = new java.util.PriorityQueue<>(Collections.reverseOrder());
        queue2.offer(3.0);
        queue2.offer(2.5);
        queue2.offer(4.0);
        queue2.offer(1.5);
        queue2.offer(2.0);

        while (!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }
        System.out.println("");


        // this will give the strings as alphabetical order.
        Queue<String> queueStr = new java.util.PriorityQueue<>();
        queueStr.offer("B");
        queueStr.offer("C");
        queueStr.offer("A");
        queueStr.offer("F");
        queueStr.offer("D");

        while (!queueStr.isEmpty()) {
            System.out.println(queueStr.poll());
        }
        System.out.println("");

        // This will give the strings as in reverse alphabetical order.
        Queue<String> queueRevStr = new java.util.PriorityQueue<>(Collections.reverseOrder());
        queueRevStr.offer("B");
        queueRevStr.offer("C");
        queueRevStr.offer("A");
        queueRevStr.offer("F");
        queueRevStr.offer("D");

        while (!queueRevStr.isEmpty()) {
            System.out.println(queueRevStr.poll());
        }
    }
}
