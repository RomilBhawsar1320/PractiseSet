package stream;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


class Workerey {
    int id;
    double salary;
    int age;
    String name;

    public Workerey(int id, double salary, int age, String name) {
        this.id = id;
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Workere{" +
                "id=" + id +
                ", salary=" + salary +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class StreamPrograms {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,11,13,14,16,19,26,2,12,133,222);
        List<Integer> evnList = intList.stream().filter(x -> x%2==0).toList();
        List<Integer> oddList = intList.stream().filter(x -> x%2!=0).toList();
//        System.out.println(evnList);
//        System.out.println(oddList);
        List<String> stringList = List.of("Romil","Priyanshi","Pompie","Priya","Sagarr","Sakshi","Akash","Shraddha");
        List<String> upperCaseList = stringList.stream().map(String::toUpperCase).toList();
        List<String> lowerCaseList = stringList.stream().map(String::toLowerCase).toList();
//        System.out.println(lowerCaseList);
        List<Integer> tenGreaterList = intList.stream().filter(x -> x>10).toList();
//        System.out.println(tenGreaterList);
        long count = intList.stream().count();
//        System.out.println(count);
// Remove duplicates from the list
        List<Integer> uniqInteList = intList.stream().distinct().toList();
//        System.out.println(uniqInteList);
//        Sort integers in ascending order.
        List<Integer> sortedList = intList.stream().sorted().toList();
//        System.out.println(sortedList);
        //        Sort integers in descending order.
        List<Integer> oppSorted = sortedList.reversed();
//        System.out.println(oppSorted);
//        Find first element in a stream.
        int firstElement = oppSorted.getFirst();
//        System.out.println(firstElement);

        //Find any element in a stream.
        int n = 12;
        boolean x = sortedList.contains(12);
//        System.out.println(x);

//        Print all elements using forEach() and Skip first N elements.
//        sortedList.stream().skip(10).forEach(System.out::println);


//        Limit stream to first N elements.
//        sortedList.stream().limit(5).forEach(System.out::println);

        List<Workerey> workers = new ArrayList<>();
        workers.add(new Workerey(1,222,22,"Romiu"));
        workers.add(new Workerey(2,22992,22,"Romi"));
        workers.add(new Workerey(3,22211,22,"RomiL"));
        workers.add(new Workerey(4,121222,22,"Romo"));
        workers.add(new Workerey(5,223222,22,"priyanshi"));
        workers.add(new Workerey(6,24322,22,"yanshi"));
        workers.add(new Workerey(7,33222,22,"anshi"));
//        workers.forEach(System.out::println);
//        Filter employees with salary > 50000.
        List<Workerey> workerGreaterSal = workers.stream().filter(work -> work.getSalary()>50000).toList();
//        workerGreaterSal.forEach(System.out::println);
//        Filter strings starting with 'A'.
        List<Workerey> stringWithA =  workers.stream().filter(work -> work.getName().startsWith("a")).toList();
//        stringWithA.forEach(System.out::println);
//        Find length of each string.
        Map<Workerey,Integer> lenMap = workers.stream().collect(Collectors.toMap(W ->W , W -> W.getName().length()));
//        for(Map.Entry<Workere,Integer> entry : lenMap.entrySet()){
//            System.out.println("worker name: "+ entry.getKey() + "length :" + entry.getValue());
//        }

//        lenMap.forEach((wor,y) -> System.out.println(wor.getName() +" : "+ y));
        List<String> stringListdup = List.of("Romil","Priyanshi","Pompie","Priya","Sagarr","Sakshi","Akash","Shraddha",
                "Romil","Priyanshi","Pompie","Priya","Sagarr","Sakshi","Akash","Shraddha","Romil","Priyanshi","Pompie","Priya","Sagarr","Sakshi", "Romil","Priyanshi",
                "Sagarr","Sakshi","Akash","Shraddha","Romil","Priyanshi","Pompie","Priya","Sagarr","Sakshi","Akash","Shraddha");

        Map<String,Long> countMap = stringListdup.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        //here the main issue will come that all keys in map must be unique that's why we used Collectors.groupingBy(e->e,Collectors.counting);
//        countMap.forEach((k,v) -> System.out.println(k+ ":"+ v));

//        Find distinct characters from list of words.
        List<Character> characterList = stringListdup.stream().flatMap(c -> c.chars().mapToObj(d ->(char)d)).distinct().toList();
        // word -> word.chars() returns IntStream containing the Unicode values of the characters:
        //mapToObj(ch -> (char) ch)
        //Currently each character is an integer ASCII/Unicode value.Now each word becomes:Stream<Character>
//        characterList.forEach(e-> System.out.print(e+" "));

//        Map employee names into a list.

        List<String> workerNames = workers.stream().map(Workerey::getName).toList();
//        System.out.println(workerNames);

//        Concatenate two streams.

        List<Integer> intStr = new ArrayList<>();
        intStr.add(1);
        List<Integer> intStr2 = Arrays.asList(4,6,3);
        intStr.addAll(intStr2);
//        System.out.println(intStr);
//        Count empty strings in list.

        List<String> emptyList = Arrays.asList("","Romil","Priyanshi","Priya","Yashil","", "");
        Long cemp = emptyList.stream().filter(String::isEmpty).count();
//        System.out.println(cemp);
//        Find words having length > 5.
        List<String> foundWords = workers.stream().map(Workerey::getName).filter(name -> name.length()>5).toList();
//        System.out.println(foundWords);
//       Sort strings alphabetically.
        List<String> alphabetOrder = workers.stream().map(Workerey::getName).sorted(String.CASE_INSENSITIVE_ORDER).toList();
//        System.out.println(alphabetOrder);
//        Get top 3 highest numbers.
        List<Integer> newListInt = Arrays.asList(11,44,55,22,76,7,23,121,12123,343,32,233,121);
        List<Integer> topThree = newListInt.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
//        System.out.println(topThree);

//        Group words by length.
        List<String> tempo = List.of("Romil","Priyanshi","Pompie","Priya","Sagarr","Sakshi","Akash","Shraddha",
                "Romil","Priyanshi","Pompie","Priya","Sagarr","Sakshi","Akash","Shraddha","Romil","Priyanshi","Pompie","Priya","Sagarr","Sakshi", "Romil","Priyanshi",
                "Sagarr","Sakshi","Akash","Shraddha","Romil","Priyanshi","Pompie","Priya","Sagarr","Sakshi","Akash","Shraddha");

        Map<String,Integer> groupwordMap = tempo.stream().distinct().collect(Collectors.toMap(k->k,String::length));
//        groupwordMap.forEach((k,v) -> System.out.println(k+":" + v));

//        Group numbers into even/odd.
        Map<String,List<Integer>> evenOdd = newListInt.stream().collect(Collectors.groupingBy(i -> i%2 == 0 ? "even":"odd"));
//        evenOdd.forEach((k,v) -> System.out.println(k + ": "+ v));

//        Find squares of numbers.

        List<Integer> squarNum = newListInt.stream().map(q ->q*q).toList();
//        System.out.println(squarNum);

//        Find sum of integers.

        Optional<Integer> cq = newListInt.stream().reduce((a,b) -> a+b);
//        System.out.println(cq); chances of list of stream can be null as well returns an Optional<Integer> is that the stream might be empty.
        Integer w = newListInt.stream().reduce(0,(a,b) -> a+b);
//        System.out.println(w);
//        Find maximum number.
        Optional<Integer> maxi = newListInt.stream().max(Comparator.comparingInt(Integer::intValue)); //
        Optional<Integer> maximum = newListInt.stream().max(Integer::compareTo); //correct way for interview
//        System.out.println(maximum.get());

        //Find minimum number.
        Optional<Integer> minmum = newListInt.stream().min(Integer::compareTo);
       // System.out.println(minmum.get());

        //average of numbers

        double avg = newListInt.stream().mapToInt(Integer::intValue).average().orElse(0.0); // correct approach for interview
        Long count3 = newListInt.stream().count();
        Integer sumall = newListInt.stream().reduce((a,b)->a+b).orElse(0);
         Long av = sumall/count3;
//        System.out.println(avg);
        // Integer intValue is an instance method not an Static method
//        System.out.println(av);

        //Join strings with comma.
        List<String> empt = Arrays.asList("","Romil","Priyanshi","Priya","Yashil","hbs", "bkxn");
        //String s = empt.stream().map(St -> St.concat(","));
        String s = empt.stream().reduce((s1,s2) -> s1.concat(","+s2)).orElse("");
//        System.out.println(s);

//        Count occurrences of each element.

        List<Integer> newListInt1 = Arrays.asList(11,44,55,22,76,7,23,121,12123,343,32,233,121,2,3,4,2,1,2,3,1,2,44);
        Map<Integer,Long> countMap2 = newListInt1.stream().collect(Collectors.groupingBy(a->a ,Collectors.counting()));
//        countMap2.forEach((k,v)-> System.out.println(k+ ":"+v));

        Map<String,Long> freqMap = tempo.stream().collect(Collectors.groupingBy(g ->g ,Collectors.counting()));
//        freqMap.forEach((k,v)-> System.out.println(k+ ":"+v));

        Long highestOccuring = freqMap.values().stream().max(Long::compareTo).orElse(0L);

        for(Map.Entry<String,Long> mimap : freqMap.entrySet()){
            if(mimap.getValue()==highestOccuring){
//                System.out.println(mimap.getKey());
            }
        }
//        System.out.println(highestOccuring);

//      Find second-highest number.

        Optional<Integer> secHigh = newListInt1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secHigh.get());

//        Find second-lowest number.

        Optional<Integer> secLowest = newListInt1.stream().distinct().sorted().skip(1).findFirst();
        System.out.println(secLowest.get());









    }
}
