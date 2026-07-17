package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionUtils {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("romil");
        myList.add("priyanshi");
        myList.add("ashi");
        myList.add("ritin");
        myList.add("ashi");
        myList.add("ashi");
        myList.add("ashi");

        Collections.sort(myList);
        System.out.println(myList);

        int index = Collections.binarySearch(myList,"romil");
        int frequency = Collections.frequency(myList,"ashi");
        System.out.println(frequency);

    }
}

/*
Collection - interface that hold the data
Collections - utility class to perform operations on Collection and it has various static methids
like sort , remove

 */


