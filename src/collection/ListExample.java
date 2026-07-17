package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListExample {

    public static void main(String[] args) {

        /*
        List interface extends collection interface and it extends iterable
        List inteface is good for insertion deletion sorting and its an ordered collection
        Arraylist , LinkedList , Stack (Classes ) extends List interface
        Frequent Insertion and deletion use LinkedList and searching sorting works good
        in ArrayList and LinkedList both
        if working in Multithreaded environment use Vector as its thread safe and Vector class
        extends stack and stack extends collection
         */


        List mylist = new ArrayList();

        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);
        mylist.add(50);

        for (Object nums : mylist){
            System.out.println(nums);
        }

        System.out.println(mylist);

        List newList = mylist.reversed();

        System.out.println(newList);

        List<Integer> anotherList = new ArrayList();

        anotherList.add(199);
        anotherList.add(399);
        anotherList.add(299);

        anotherList.addAll(mylist);

        System.out.println(anotherList);






    }
}
