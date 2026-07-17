package collection;

import java.util.*;

class Students  {
    private int id;
    private String name;
    private int stipend;
    private int age;

    public Students(int id, String name, int stipend, int age) {
        this.id = id;
        this.name = name;
        this.stipend = stipend;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStipend() {
        return stipend;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stipend=" + stipend +
                ", age=" + age +
                '}';
    }



}

class SortByAges implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
        if(o1.getAge()> o2.getAge()){
            return 1;
        } else if (o1.getAge()< o2.getAge()) {
            return -1;
        }
        return 0;
    }
}

class Teacher {
     private String[] subjects;
     private int id;
     private String name;
     private int salary;
     private int age;

    public Teacher(String[] subjects, int id, String name, int salary, int age) {
        this.subjects = subjects;
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subjects=" + Arrays.toString(subjects) +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }


}

class SortTeacherByAge implements Comparator<Teacher>{
    public int compare(Teacher t1, Teacher t2){
        return Integer.compare(t1.getAge(),t2.getAge());
    }
}

public class ComparableAndComparator {
    public static void main(String[] args) {

        List<Students> students1 = new ArrayList<>();
        students1.add(new Students(1,"Priyanshi",20000,23));
        students1.add(new Students(3,"Sakshi",10000,21));
        students1.add(new Students(6,"Romil",5000,24));
        students1.add(new Students(2,"Sagarr",2000,26));

        students1.sort(new SortByAges());
        System.out.println(students1);

        students1.sort((o1, o2) -> {
            if (o1.getStipend() > o2.getStipend()) {
                return 1;
            } else if (o1.getStipend() < o2.getStipend()) {
                return -1;
            } else
                return 0;
        });

        System.out.println(students1);

        students1.sort(Comparator.comparingInt(Students::getId));
        System.out.println(students1);

        students1.sort((o1,o2) -> Integer.compare(o2.getId(), o1.getId()));
        System.out.println(students1);

        students1.sort(Comparator.comparing(Students::getName).reversed());
        System.out.println(students1);

        students1.sort((o1,o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(students1);

        System.out.println("---------------------------------------------------");

        List<Teacher> tList = new ArrayList<>();
        tList.add(new Teacher(new String[]{"Maths", "Physics"},1,"Bhide",20000,50));
        tList.add(new Teacher(new String[]{"Chemistry", "Physics","Biology"},2,"Iyer",25000,55));
        tList.add(new Teacher(new String[]{"Hindi","Gujarati" },3,"Jethalal",5000,52));
        tList.add(new Teacher(new String[]{"Moral Science"},4,"Champaklal",2000,80));

        Collections.sort(tList,new SortTeacherByAge());

        System.out.println(tList);

        System.out.println("---------------------------------------------------");

        tList.sort((t1, t2) -> Integer.compare(t1.getSalary(), t2.getSalary()));

        System.out.println(tList);

        System.out.println("---------------------------------------------------");

        tList.sort(Comparator.comparing(Teacher::getName));

        System.out.println(tList);




    }
}
