package com.ivycomptech.AmusementPark;
import java.util.Scanner;
public class Driver{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        try{
            if(height<120)
            {
                throw new CustomizedException("Not eligible for ride");
            }
            else
                System.out.println("Eligible for ride");
        }
        catch (CustomizedException e) {
            System.out.println(e.getMessage()+" handled");
        }
        
    }
}
