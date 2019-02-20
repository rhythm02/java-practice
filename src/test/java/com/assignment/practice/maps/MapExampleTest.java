package com.assignment.practice.maps;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class MapExampleTest {
    HashMap<Integer, String> map;

    @Before
    public void init(){
        map = new HashMap<Integer, String>();
    }

    @Test
    public void mapExampleTest(){
        map.put(1, "abc");
        map.put(2, "xyz");
        map.put(3, "def");
        map.put(4, "jkl");
    }




}