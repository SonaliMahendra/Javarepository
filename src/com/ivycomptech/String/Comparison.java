package com.ivycomptech.String;

public class Comparison {
    public static void main(String[] args) {
        String string1 = "Stephen Edwin King";
        String string2 = "Walter Winchell";
        String string3 = "Mike Royko";

        // Are any of the above Strings equal to one another?
        boolean equals1 = string1.equals(string2);
        boolean equals2 = string1.equals(string3);

        // Display the results of the equality checks.
        System.out.println("\"" + string1 + "\" equals \"" +
                string2 + "\"? " + equals1);
        System.out.println("\"" + string1 + "\" equals \"" +
                string3 + "\"? " + equals2);
    }
}
