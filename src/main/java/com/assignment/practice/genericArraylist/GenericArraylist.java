package com.assignment.practice.genericArraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GenericArraylist {
    public static <T extends Comparable> ArrayList<T> sortList(List<T> al){

        List<T> aList = new ArrayList<>();
        List<T> bList = new ArrayList<>();

        for(int i=0; i<al.size(); i++){
            if(!aList.contains(al.get(i))){
                aList.add(al.get(i));
            }
            else{
                aList.remove(al.get(i));
                if(!bList.contains(al.get(i)))
                    bList.add(al.get(i));
            }
        }
        Collections.sort(aList);
        Collections.sort(bList);

        aList.addAll(bList);
        return (ArrayList<T>) aList;

    }
}
