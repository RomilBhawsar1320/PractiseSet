package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Candidate{
    private String education;
    private int passOutYear;
    private int percentage;
    private int aptTest;
    private String name;

    public String getName() {
        return name;
    }

    public String getEducation() {
        return education;
    }

    public int getPassOutYear() {
        return passOutYear;
    }

    public int getPercentage() {
        return percentage;
    }

    public int getAptTest() {
        return aptTest;
    }

    public Candidate(String education, int passOutYear, int percentage, int aptTest , String name) {
        this.education = education;
        this.passOutYear = passOutYear;
        this.percentage = percentage;
        this.aptTest = aptTest;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "education='" + education + '\'' +
                ", passOutYear=" + passOutYear +
                ", percentage=" + percentage +
                ", aptTest=" + aptTest +
                ", name =" + name+
                '}';
    }
}

class Employee{
    private String name;
    private String department;
    private int salary;

    public Employee(String department, String name, int salary) {
        this.department = department;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("romil","priyanshi","sakshi","sagarr","akash","shraddha","ankush","Nikhil");

        // Output where names starts with s and all in UpperCase

        List<String> outputNames = new ArrayList<>();
//        for(String name : names){
//            if (name.startsWith("s")){
//                outputNames.add(name.toUpperCase());
//            }
//        }
//
//        System.out.println(outputNames);
// stream example below
        List<String> myNames = names.stream()
                .filter((name)-> name.startsWith("s") && name.endsWith("i") )
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(myNames);


        List<Candidate> candidates = new ArrayList<>();

        candidates.add(new Candidate("BTECH", 2023, 86, 90, "Priyanshi"));
        candidates.add(new Candidate("MCA", 2021, 78, 88, "Aarav"));
        candidates.add(new Candidate("BTECH", 2026, 82, 91, "Ananya"));
        candidates.add(new Candidate("BTECH", 2020, 75, 85, "Vivaan"));
        candidates.add(new Candidate("MTECH", 2019, 84, 92, "Diya"));
        candidates.add(new Candidate("BTECH", 2017, 79, 87, "Aditya"));
        candidates.add(new Candidate("MTECH", 2016, 81, 89, "Ishita"));
        candidates.add(new Candidate("BTECH", 2012, 77, 86, "Krish"));
        candidates.add(new Candidate("MTECH", 2023, 85, 94, "Myra"));
        candidates.add(new Candidate("BTECH", 2024, 76, 84, "Arjun"));
        candidates.add(new Candidate("MCA", 2025, 83, 90, "Saanvi"));
        candidates.add(new Candidate("BTECH", 2026, 74, 82, "Reyansh"));
        candidates.add(new Candidate("BTECH", 2027, 86, 95, "Kiara"));
        candidates.add(new Candidate("MTECH", 2028, 80, 88, "Atharv"));
        candidates.add(new Candidate("BTECH", 2024, 78, 89, "Aadhya"));
        candidates.add(new Candidate("MCA", 2029, 87, 96, "Aryan"));
        candidates.add(new Candidate("BTECH", 2020, 73, 81, "Sara"));
        candidates.add(new Candidate("BCA", 2026, 82, 93, "Vedant"));
        candidates.add(new Candidate("BTECH", 2025, 79, 90, "Riya"));
        candidates.add(new Candidate("BCA", 2020, 88, 97, "Kabir"));

        List<Employee> employees = candidates.stream()
                .filter((n) -> n.getPercentage()>80 && n.getPassOutYear()>2022 && n. getAptTest()>85 )
                .map((n) -> new Employee("TU",n.getName(),10000000))
                .toList();

        System.out.println(employees);

        List<Integer> integerList = List.of(1,2,3,4,5,2,3,45,5,3,23);
        int sum = integerList.stream()
                .filter(n -> n%2!=0)
                .reduce(0,Integer::sum);
        System.out.println(sum);

        Map<String, List<Candidate>> candidateMap = candidates.stream()
                .collect(Collectors.groupingBy(Candidate::getEducation));
        System.out.println(candidateMap);








    }
}
