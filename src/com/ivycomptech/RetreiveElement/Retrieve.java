package com.ivycomptech.RetreiveElement;

import java.util.*;
public class Retrieve {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<>();
        listStrings.add("Red");
        listStrings.add("Green");
        listStrings.add("Orange");
        listStrings.add("White");
        listStrings.add("Black");
        System.out.println(listStrings);
        String element = listStrings.get(0);
        System.out.println("First element: " + element);
        element = listStrings.get(2);
        System.out.println("Third element: " + element);
    }
}