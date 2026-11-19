package org.example;
import java.util.Arrays;
public class Main {
    static void main() {


        int [] numbers = {5, 0, -19, 8, 17};

        //Print increment on one line.
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //print increment different lines.
        for (int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }


        //equals
        int [] number1 = {5, 0, -19, 8, 17};
        int [] number2 = {5, 0, -19, 8, 17};
        int [] number3 = {5, 0, -19, 8, 17};

        boolean result1 = Arrays.equals(number1, number2);
        System.out.println(result1);

        if (Arrays.equals(number1, number2) && Arrays.equals(number2, number3)){
            System.out.println("they are equal");
        }
        else {
            System.out.println("not equal");}



    }
}
