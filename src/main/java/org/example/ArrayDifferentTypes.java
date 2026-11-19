package org.example;

import java.util.ArrayList;

public class ArrayDifferentTypes {
    public static void main(String[] args) {

        //Array can not store different types of data. It can store only one type of data.
        //Arraylist can store different types of data.
        ArrayList<Object> studentinfos = new ArrayList<>();
        studentinfos.add("Lela");
        studentinfos.add(25);
        studentinfos.add('A');
        studentinfos.add(95.5);
        System.out.println(studentinfos);
        //[Lela, 25, A, 95.5]


        ArrayList<Integer> studentInfosAge = new ArrayList<>();
        studentInfosAge.add(25);
        studentInfosAge.add(30);
        System.out.println(studentInfosAge);
        //[25, 30]



        ArrayList<Double> studentinfoages = new ArrayList<>();
        studentinfoages.add(25.5);
        studentinfoages.add(223.0);
        System.out.println(studentinfoages);
        //[25.5, 223.0]





    }

}
