package com.ivycomptech.PageFlipExercise;
import java.util.Scanner;
public class PageFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of pages");
        int num=scanner.nextInt();
        System.out.println("Enter page to reach");
        int pageNum= scanner.nextInt();
        if(num-pageNum>=pageNum){
            System.out.println(pageNum/2);
        }else{
            if(num%2==0){
                System.out.println((num-pageNum+1)/2);
            }else{
                System.out.println((num-pageNum)/2);
            }
        }
    }
}
