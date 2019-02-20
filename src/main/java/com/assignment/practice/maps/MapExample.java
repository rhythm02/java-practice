package com.assignment.practice.maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample {


    public void foo(HashMap<Integer, String> map){
        print(map);

        System.out.println("Size of map is:- " + map.size());
        print(map);

        if (map.containsKey(1))
        {
            String a = map.get(1);
            System.out.println("value for key \"1\" is:- " + a);
        }

        map.clear();
        print(map);
    }

    public void print(HashMap<Integer, String> map){
        for (HashMap.Entry<Integer,String> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
}


