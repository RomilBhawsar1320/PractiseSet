package programs;

import java.util.ArrayList;
import java.util.List;

public class StringMostOccured {

    public static void main(String[] args) {

        String myStr = "bjhacbhdcjvcbjsadbjcvgjhsabnjbsjhxbjh";

        List<Character> myCharList = new ArrayList<>();

        for(int i=0 ; i < myStr.length() ; i++){
            myCharList.add(myStr.charAt(i));
        }



    }




}
