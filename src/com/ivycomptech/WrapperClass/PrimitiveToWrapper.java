package com.ivycomptech.WrapperClass;

public class PrimitiveToWrapper {
    public static void main(String[] args) {
        int a=9;
        Integer value1=a;
        double d=6.78;
        Double value2=d;
        if(value1.getClass().isPrimitive())
            System.out.println("It is a primitive type");
        else
            System.out.println("An object of Integer is created");
        if(value2.getClass().isPrimitive())
            System.out.println("It is a primitive type");
        else
            System.out.println("An object of Double is created");
    }
}
