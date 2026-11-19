package org.example;

public class forr {
    static void main(String[] args) {

        int[] numbers = {17, 5, 0, -19, 8, 0};

        //print number using loop but adding position of the number in the array, separate each number with a new line.
        for (int i=0; i<numbers.length; i++){
        System.out.println(i + "   is   " + numbers[i]);
        }
        /* EX: 0   is   17
               1   is   5
               2   is   0
               3   is   -19
               4   is   8
               5   is   0  */

        //print numbers using for loop, separate each number with a new line.
        for (int x : numbers){
            System.out.println(x);
        } /*17
           5
           0
           -19
           8
           0  */

        //მასივს აქვს წინასწარ განსაზღვრული ზომა.
        //print names using for loop, separate each name with a new line
        String [] names = {"lela", "salome", "nino"};
        for (String name : names) {
            System.out.println(name);
        }  /* lela
              salome
              nino
         */

    }
}
