package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeData {
    private int id;
    private int age;
    private int salary;
    private String name;

    public EmployeeData(int id , int age , int salary,String name){
        this.id= id;
        this.age=age;
        this.salary=salary;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "id=" + id +
                ", age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}

class SortByAge implements Comparator<EmployeeData>{
    @Override
    public int compare(EmployeeData o1, EmployeeData o2) {
        return o1.getAge()- o2.getAge();
    }
}

class SortBySalary implements Comparator<EmployeeData>{

    @Override
    public int compare(EmployeeData o1, EmployeeData o2) {
        return o1.getSalary() - o2.getSalary();
    }
}
public class ComparatorExample {
    public static void main(String[] args) {

        List<EmployeeData> ourList = new ArrayList<>();
        ourList.add(new EmployeeData(1,23,28982,"Romil"));
        ourList.add(new EmployeeData(4,28,99782,"Priyanshi"));
        ourList.add(new EmployeeData(8,26,28902,"Sagarr"));
        ourList.add(new EmployeeData(2,21,28912,"Sakshi"));

        Collections.sort(ourList,new SortByAge());
        System.out.println(ourList);

        Collections.sort(ourList,new SortBySalary());
        System.out.println(ourList);

        Collections.sort(ourList,(E1,E2) -> {
            return E1.getName().compareTo(E2.getName());
        });
        System.out.println(ourList);
        // using lambda you don't need to define a class and as the class extends
        //Comparator it is a functional interface you can use Lambda

        /*
        Method References = Classname :: methodName
        if(name.equals("age"){
        Collections.sort(studentList,Comparator.comparingInt(Student :: getAge);
       }
       if(name.equals("name"){
       Collections.sort(studentList,Comparator.comparing(Student :: getName);
       }

         */

    }
}

/*
here we can create so many implementation by different categories as well like by age , by name , by salary
that's why this Comparator interface Compare method is feasible
we can take user input by which attribute he wants the data to be sorted
 */
