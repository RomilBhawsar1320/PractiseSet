package collection;

import java.util.*;

class Worker implements Comparable<Worker>{
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Worker(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        // this -> current object
        //other o -> other object

        if (this.age>o.age){
            return 1;
        } else if (this.age<o.age) {
            return -1;
        }else
        return 0;
    }
    /*
    compareTo Return Values
    0 = two elements are equal
    +ve = if first element is smaller than other
    -ve = if first element is larger than other

     */
}
public class CustomObject {

    public static void main(String[] args) {

        Map<Integer,Worker> myWorkers = new HashMap<>();
        myWorkers.put(1,new Worker(1,"Romil",30));
        myWorkers.put(2,new Worker(2,"Sagarr",30));
        myWorkers.put(3,new Worker(3,"Saksh i",30));
        myWorkers.put(4,new Worker(4,"Priyanshi",30));

        for(Map.Entry<Integer,Worker> workers : myWorkers.entrySet()){
            System.out.println(workers);
        }

        List<Worker> newWorkers = Arrays.asList(new Worker(1,"Romil",30),
                new Worker(2,"Romila",30),
                new Worker(3,"Romilo",36),
                new Worker(4,"Romilii",32)

        );
        Collections.sort(newWorkers);
        System.out.println(newWorkers);

        // List of is immutable list
        //newWorkers.add(new Worker(2,"Romila",30)); this will not work here


    }
}
