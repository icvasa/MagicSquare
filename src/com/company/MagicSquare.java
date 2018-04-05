package com.company;

import com.sun.rowset.internal.Row;

import java.util.ArrayList;

public class MagicSquare {

    static int n3 = 3;
   // static int array3[][] = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};

    static int array3[][] = {{4, 9, 2}, {3, 15, 7}, {8, 1, 6}};



    public static void main(String[] args) {

        int res = 1;
        int sum0 = 0, sum;


        for (int j = 0; j < n3; j++)
            sum0 += array3[0][j];
        //Суммы по строкам
        for (int i = 1; i < n3; i++) {
            sum = 0;
            for (int j = 0; j < n3; j++)
                sum += array3[i][j];
            if (sum != sum0) {
                res = 0;
                break;
            }
        }

//по столбцам

        if (res == 1) {
            for (int j = 0; j < n3; j++) {
                sum = 0;
                for (int i = 0; i < n3; i++) sum += array3[i][j];
                if (sum != sum0) {
                    res = 0;
                    break;
                }
            }
        }


        //Главная диагональ
        if (res == 1) {
            sum = 0;
            for (int i = 0; i < n3; i++) sum += array3[i][i];
            if (sum != sum0) res = 0;
        }
        //Побочная диагональ
        if (res == 1) {
            sum = 0;
            for (int i = 0; i < n3; i++) sum += array3[i][n3 - 1 - i];
            if (sum != sum0) res = 0;
        }
        //Вывод

        String result = ((res == 1) ? "Yes": "No");

        System.out.println( "Result:" + result);


    }
}






    /*public static ArrayList<Integer> RowSum(int dim, int[][] arr) {

        ArrayList<Integer> rowsum = new ArrayList<>();
        int sum;

        for (int row = 0; row < arr.length; row++) {

            sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
            }

            rowsum.add(sum);
        }

        return rowsum;
    }
*/




