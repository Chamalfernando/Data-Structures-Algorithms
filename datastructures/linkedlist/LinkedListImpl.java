package datastructures.linkedlist;

import java.util.LinkedList;

public class LinkedListImpl {

    /*
    *
    *   LinkedList = stores Nodes in 2 parts (data + address)
    *                Nodes are in non-consecutive memory locations
    *                Elements are linked using pointers.
    *
    *
    *                                   Singly Linked List
    *                       Node                Node                Node
    *                   [data | address] -> [data | address] -> [data | address]
    *
    *                                   Doubly Linked List
    *                       Node                Node                Node
    *                   [address | data | address] <-> [address | data | address]
    *
    *                Advantages ?
    *                1. Dynamic Data Structure (allocates needed memory while running)
    *                2. Insertion and Deletion of Nodes is easy. O(1).
    *                3. No / Low memory waste.
    *
    *                Disadvantages ?
    *                1. Greater memory usage (additional pointer)
    *                2. No random access of elements (no index[i])
    *                3. Accessing/searching elements is more time consuming. O(n)
    *
    *                Uses?
    *                1. Implement Stacks/Queues
    *                2. GPS Navigation
    *                3. music playlist.
    *
    * */

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // linkedlist as a stack.
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();

        System.out.println(linkedList);

        LinkedList<String> linkedListQueue = new LinkedList<>();

        // linkedlist as a queue.
        linkedListQueue.offer("A");
        linkedListQueue.offer("B");
        linkedListQueue.offer("C");
        linkedListQueue.offer("D");
        linkedListQueue.offer("F");
        linkedListQueue.poll();

        System.out.println(linkedListQueue);

        linkedListQueue.add(2,"G");
        System.out.println(linkedListQueue);
        linkedListQueue.remove("D");

        System.out.println(linkedListQueue.indexOf("D"));
        System.out.println(linkedListQueue);

        System.out.println(linkedListQueue.peekFirst());
        System.out.println(linkedListQueue.peekLast());
        linkedListQueue.addFirst("0");
        linkedListQueue.addLast("89");


        String first = linkedListQueue.removeFirst();
        String last = linkedListQueue.removeLast();
        System.out.println(first);
        System.out.println(last);

        System.out.println(linkedListQueue);

    }

}
