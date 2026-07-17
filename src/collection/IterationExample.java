package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Workery implements Comparable<Workery>{
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

    public Workery(int id, String name, int age) {
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
    public int compareTo(Workery o) {
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

public class IterationExample {
    public static void main(String[] args) {

        List<Workery> newWorkers = Arrays.asList(new Workery(1,"Romil",30),
                new Workery(2,"Romila",30),
                new Workery(3,"Romilo",36),
                new Workery(4,"Romilii",32)

        );




        newWorkers.forEach((val) -> System.out.println(val + " :" + val.getName()));
        Iterator<Workery> itr = newWorkers.iterator();
        while(itr.hasNext()){
            Workery value = itr.next();
            System.out.println(value);
        }



        List<String> iterlist = Arrays.asList("Romil","Priyanshi","Sagarr","Sakshi","Pompie","Priya");
        List<String> iterlist1 = List.of("Romil","Priyanshi","Sagarr","Sakshi","Pompie","Priya");

        Iterator<String> itr1 = iterlist1.iterator();

        while(itr1.hasNext()){

            String val2 = itr1.next();
//            if (val2.equals("Romil")){
//               itr1.remove();
//            }
            System.out.println(val2);

        }



        System.out.println("------------------------------------------------------");

        iterlist.forEach((name) -> System.out.print(name + "::"));

        System.out.println("-------------------below Method reference -----");

        iterlist.forEach(System.out::println);

    }
}

/*List created using Arrays.asList doesnot return a regular array list it returns a fixed sized List
backed by original Array so operation that can change size of list are not supproted
and throw unsupported operation exception

and similarly if use List.of method to create a list it created a immutable list where cant modify
and it also throw exception
 */

