package org.example;

import java.util.ArrayList;

public class ArrayStrings {
    static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("lela");
        names.add("salome");
        names.add("levani");
        //Arraylist methods:
        names.add(1, "zura"); //add but another parameter
        names.remove(2); //remove by index. will be deleted Salome.

        System.out.println(names);
        //[lela, zura, levani]

        for (int i = 0; i<names.size(); i++) {
            System.out.println(names.get(i));
        } /*lela
            zura
            levani*/

        //Array მასივი [] - წინასწარ იცი რაოდენობა ელემენტების.
        //Arraylist-ში - არ იცი რაოდენობა წინასწარ, რა ტიპი იქნება არიცი.


    }
}
