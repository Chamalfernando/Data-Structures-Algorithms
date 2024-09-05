package datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        /*
        *  *******************************************************************
        *
        * Queue = FIFO data structure. (First In First Out) Ex: Line of people.
        * A collection designed for holding elements prior to processing Linear data structure.
        *
        *
        * add - enqueue, offer()
        * remove - dequeue, poll()
        *
        * */

        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        // Inserts element into this queue.

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());

        System.out.println(queue.size());
        System.out.println(queue.contains("Chad"));

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll(); // this won't give exception if the queue is over.
//        queue.element(); // but this will give an exception.

        System.out.println(queue);

        // Where are queues useful?

        /*
        * 1. keyboard Buffer (letters should appear on the screen in the order they're pressed)
        * 2. Printer Queue (Print jobs should be completed in order)
        * 3. Used in LinkedLists, PriorityQueues, Breadth-first Search.
        * */

    }
}
