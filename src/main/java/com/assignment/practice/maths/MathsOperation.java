package com.assignment.practice.maths;

public class MathsOperation {
    public int add(int a, int b){
        return a+b;
    }

    public float division(float a, float b){
        float c=0;
        try{
            c = a/b;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        return c;
    }
}
