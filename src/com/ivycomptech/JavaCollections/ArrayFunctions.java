package com.ivycomptech.JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFunctions {
    public static void main(String[] args)
    {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("White");
        arrayList.add("Pink");
        arrayList.add("Green");
        arrayList.add("Yellow");
        System.out.println(arrayList);
        for(String s:arrayList)
            System.out.println(s);
        arrayList.add(0,"Purple");
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        arrayList.set(0,"Red");
        arrayList.set(1,"Orange");
        arrayList.set(2,"Black");
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.contains("Black"));
        System.out.println(arrayList.contains("Purple"));
        System.out.println("ArrayList before sorting "+arrayList);
        Collections.sort(arrayList);
        System.out.println("ArrayList after sorting "+arrayList);//ascending order
        ArrayList<String> arrayList1=  new ArrayList<>();
        arrayList.addAll(arrayList1);
        System.out.println("Original array list:"+arrayList);
        System.out.println("Copied array list:"+arrayList1);
        Collections.shuffle(arrayList1);
        System.out.println("After shuffled "+arrayList1);
        Collections.reverse(arrayList1);
        System.out.println("After reversing "+arrayList1);
        List<String> list=  arrayList1.subList(0,3);
        System.out.println("extracting 1st 3 elements "+list);
        list.add("Grey");
        System.out.println(list);
        ArrayList<String> result=new ArrayList<>();
        for(String s:arrayList1) {
            result.add(list.contains(s)?"Yes":"No");
        }
        System.out.println(result);
        Collections.swap(list,1,2);
        System.out.println("After swapping "+list);
        ArrayList<String> join=new ArrayList<>();
        join.addAll(arrayList);
        join.addAll(list);
        System.out.println("After joining all the elements "+join);
        arrayList1.clear();
        System.out.println(arrayList1);
        System.out.println(arrayList.isEmpty());
        arrayList.trimToSize();
        System.out.println("After trimming the size of arraylist "+arrayList);
        arrayList.ensureCapacity(100);
        System.out.println("After increasing the capacity of arrayList "+arrayList);
        arrayList.set(1,"Black");
        System.out.println(arrayList);
        ArrayList<String> elements=new ArrayList<>();
        elements.add("black");
        elements.add("white");
        elements.add("red");
        elements.add("pink");
        for (String element : elements) {
            System.out.println(element);
        }
    }
}