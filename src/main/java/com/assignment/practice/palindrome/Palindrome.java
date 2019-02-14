package com.assignment.practice.palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Palindrome {

        public int checkPalindrome(String str){

            char[] ch = str.toCharArray();

            ArrayList<Character> arr = new ArrayList<>();
            for(int i=0; i<str.length(); i++){

                if(!arr.contains(Character.valueOf(ch[i])))
                    arr.add(Character.valueOf(ch[i]));
                else
                    arr.remove(Character.valueOf(ch[i]));

            }

            if(arr.size() == 0 || arr.size() ==1)
                //it is a palindrome
                return 1;
            else
                //not a palindrome
                return 0;
        }



}
