package collection;

import java.util.*;

class Student implements Comparable<Student>{
    private int id ;
    private String name;

    public Student(int id, String name){
        this.id= id;
        this.name = name;
    }

    public String getName(Student student){
        return  student.name;
    }
    public int getId(Student student){
        return  student.id;
    }
    @Override
    public int compareTo(Student other){
        Integer ide = this.id;

        return ide.compareTo(other.id);
    }

}
public class SetExample {

    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        mySet.add(40);
        mySet.add(40);
        /*
        Set Interface has hashset , TreeSet and LinkedHashSet
        Set is an unordered collection and doesn't allow duplicates
        LinkedHashSet maintains the insertion order
        TreeSet give in sorted order
         */

        System.out.println(mySet);

        Set<Student> myStudents = new LinkedHashSet<>();
        myStudents.add(new Student(1,"Priyanshi"));
        myStudents.add(new Student(2,"Romil"));
        myStudents.add(new Student(3,"Sagarr"));
        myStudents.add(new Student(4,"Sakshi"));

        System.out.println(myStudents);

        for(Student a : myStudents){
            System.out.println(a.getId(a) + ": " + a.getName(a) );
        }

        Set<Integer> forSet = new TreeSet<>();

        for(int i =0 ; i<100 ; i+=3){
            forSet.add(i);

        }

        System.out.println(forSet);


        Set<Student> compStudents = new TreeSet<>();


            compStudents.add(new Student(1,"Priyanshi"));
            compStudents.add(new Student(2,"Priya"));
            compStudents.add(new Student(3,"Romil"));
            compStudents.add(new Student(3,"Romil"));



        for(Student a : compStudents){


            System.out.println(a.getId(a) + ": " + a.getName(a) );
        }






    }

}

/*



 */