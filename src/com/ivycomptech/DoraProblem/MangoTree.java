package com.ivycomptech.DoraProblem;
import java.util.Scanner;
public class MangoTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows, number of columns, tree number");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int treeNumber=sc.nextInt();
        if((treeNumber>=1 && treeNumber<=cols)||(treeNumber%cols==0)||(treeNumber%cols==1))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
