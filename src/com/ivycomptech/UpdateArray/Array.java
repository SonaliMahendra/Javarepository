package com.ivycomptech.UpdateArray;

import java.util.*;
public class Array {
    public static void main(String[] args) {
        ArrayList<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println(list_Strings);
        list_Strings.set(2, "Yellow");
        System.out.println(list_Strings);
    }
}
