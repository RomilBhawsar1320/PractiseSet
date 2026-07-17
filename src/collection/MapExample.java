package collection;


import com.sun.jdi.Value;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {

     /*
     HashMap has put method to add and get to retrieve and to delete remove method
     Map.Entry<Integer,String> x : mapname.entrySet()
      */
       Map<Integer,String> students = new HashMap<>();
       students.put(1,"Priyanshi");
        students.put(2,"Priya");
        students.put(3,"Romil");
        students.put(4,"Yashil");
        students.put(4,"overrided Yashil");
        System.out.println(students);

        String val2 = students.get(3);
        System.out.println(val2);

        students.forEach((key,val) -> System.out.println(key + ":" + val));

// iterating map
        for (Map.Entry<Integer,String> x: students.entrySet()){
            System.out.println(x.getKey() + ":"+ x.getValue());
        }

// iterating using set overall its same only
       Set<Map.Entry<Integer,String>> mySetMap = students.entrySet();

        for(Map.Entry<Integer,String> y : mySetMap){
            System.out.println(y.getKey() + ">>"+ y.getValue());
        }

 // iterating only the values

        Collection<String> mapValues = students.values();

        for (String z : mapValues){
            System.out.println(z);
        }


    }
}

/*
Map -> (non-ordered) key | value
HashMap -> HashSet => Non Ordered
LinkedHashMap -> LinkedHashSet => Ordered
Treemap -> TreeSet => Data will be sorted based on key

HashTable came in java 1.0 version and Hashmap came in 1.2 version
HashTable -> Thread Safety -> Data will be in consistent state if you share your HashTable with multiple Threads
whereas Hashmap is not thread safe and not synchronised

ConcurrentHashMap is also threadsafe and this is faster than your hashtable.

Properties class -> key & value
- Mostly used for retrieving properties file where your system level app level configuration.

application .properties
server.port=8080
db.url=
db.port=
db.username=
db.password=
 */
