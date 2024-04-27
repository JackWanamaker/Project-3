package main;

import java.util.ArrayList;

public class MiscellaneousFuntions {

    public static <T> void arraylistEmpty(ArrayList <T> myList){
        if (myList.isEmpty()){
            throw new IllegalArgumentException();
        }
    }
}
