package com.assignment.practice.genericArraylist;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericArraylistTest {
    @Test
    public void shouldSortList() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(90);
        list.add(143);
        list.add(-1);
        list.add(0);
        list.add(-1);
        list.add(1);
        list.add(90);
        list.add(58);
        list.add(86);
        ArrayList<Integer> integers = GenericArraylist.sortList(list);

        // Assert.assertArrayEquals(Arrays.asList(1, 10).toArray(), integers.toArray());
        Assert.assertArrayEquals(Arrays.asList(0, 10, 58, 86, 143, -1, 1, 90).toArray(), integers.toArray());

    }
}