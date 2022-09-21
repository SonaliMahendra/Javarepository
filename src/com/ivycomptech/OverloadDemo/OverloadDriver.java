package com.ivycomptech.OverloadDemo;

public class OverloadDriver {
    public static void main(String[] args) {
        Overload ob = new Overload();
        ob.area(5.1f);
        ob.area(11.2f,12.3f);
        ob.area(2.5f);
    }
}
