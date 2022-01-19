package com.company.mock;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

//T:: O(N)
//S:: O(N) - worst case

public class Mock2 {
    //
    //Apple, bat, ball, cat , apple,
    //Apple -2
    public static void main(String[] args) {

        String[] arrayString= {"Apple", "bat", "ball", "cat" , "apple"};
        System.out.println(findNoOfCoundString("London", arrayString));

    }

    public static int findNoOfCoundString(String searchString, String arrayString[] ){

        Map<String, Integer> freqMap = new HashMap<>();

        for(int i=0;i<arrayString.length;i++){

            if(freqMap.containsKey(arrayString[i].toLowerCase(Locale.ROOT))){
                freqMap.put(arrayString[i].toLowerCase(Locale.ROOT), freqMap.get(arrayString[i].toLowerCase(Locale.ROOT))+1);
            }
            else{
                freqMap.put(arrayString[i].toLowerCase(Locale.ROOT),1);
            }
        }

        if(freqMap.containsKey(searchString.toLowerCase(Locale.ROOT))){
            return freqMap.get(searchString);
        }

        return -1;
    }

}
