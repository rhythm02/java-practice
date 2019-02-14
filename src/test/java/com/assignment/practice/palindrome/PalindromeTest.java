package com.assignment.practice.palindrome;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    private Palindrome palindrome;
    @Before
    public void init(){
    palindrome = new Palindrome();
    }
    @Test
    public void testPalindrome(){

        assertEquals(1,palindrome.checkPalindrome("deeds"));
    }
}