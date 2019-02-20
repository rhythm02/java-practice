package com.assignment.practice.magicSquare;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {

        String [][] matrix = new String[4][4];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<4; i++){
            String s1 = sc.nextLine();
            matrix[i]=s1.split(" ");
        }

        int first=0;
        for(int i=0; i<4; i++)
            first = first + Integer.parseInt(matrix[0][i]);

        int flag =0;

        for(int i=0;i<4;i++){
            int n,m;
            int sumRows=0;
            int sumCol=0;

            for(int j=0;j<4;j++){
                n = Integer.parseInt(matrix[i][j]);
                sumRows = sumRows+n;

                m = Integer.parseInt(matrix[j][i]);
                sumCol = sumCol + m;
            }

            if(sumRows != first){
                flag=1;
                System.out.println("Not a magic Square");
                break;
            }
            if(sumCol!= first){
                flag=1;
                System.out.println("Not a magic Square");
                break;
            }
            if(flag==0){
                System.out.println("it is a magic square");
            }
        }



    }
}
