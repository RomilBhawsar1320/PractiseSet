package collection;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {

        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);

        System.out.println(myQueue);
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue);
        System.out.println(myQueue.peek());

        Queue<Integer> pque =  new PriorityQueue<>(Comparator.reverseOrder());
        pque.offer(12);
        pque.offer(13);
        pque.offer(14);
        pque.offer(15);
        System.out.println(pque);


    }
}

/*
Queue interface is implemented by LinkedList class but if you do new Queue then
all methods to be overridden
PriorityQueue , ArrayBlockingQueue , LinkedBlockingQueue are classes
ArrayBlockingQueue , LinkedBlockingQueue are Thread Safe as they are Synchronized

PriorityQueue uses HeapBinary Tree data Structure internally
 */

