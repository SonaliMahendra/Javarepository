package com.ivycomptech.MagicSquareExercise;
import java.util.Scanner;
public class MagicSquare
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr = new int [row][col];
        System.out.println("Enter the elements of array");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(ints[j]);
            }
            System.out.println();
        }
        int[] rowSum =new int [row];
        int[] colSum =new int[col];
        for(int i=0;i<row;i++)
        {
            int sum=0;
            for(int j=0;j<col;j++)
            {
                sum=sum+arr[i][j];
                rowSum[i]=sum;
            }
        }
        for (int value : rowSum) {
            System.out.println(value);
        }
        int sumOfAllRow=0;
        for (int k : rowSum) {
            sumOfAllRow = sumOfAllRow + k;
        }
        System.out.println(sumOfAllRow);
        for(int i=0;i<row;i++)
        {
            int sum=0;
            for(int j=0;j<col;j++)
            {
                sum=sum+arr[j][i];
                colSum[i]=sum;
            }
        }
        for (int k : colSum) {
            System.out.println(k);
        }
        int sumOfAllCol=0;
        for (int k : colSum) {
            sumOfAllCol = sumOfAllCol + k;
        }
        System.out.println(sumOfAllCol);
        int sumOfForDgnl=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==j)
                {
                    sumOfForDgnl=sumOfForDgnl+arr[i][j];
                }
            }
        }
        System.out.println(sumOfForDgnl);
        int sumOfBackDngl=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i+j==col-1)
                {
                    sumOfBackDngl=sumOfBackDngl+arr[i][j];
                }
            }
        }
        System.out.println(sumOfBackDngl);
        int a=sumOfAllCol/col;
        int b=sumOfAllRow/row;
        if(sumOfBackDngl==b && sumOfBackDngl==a && sumOfBackDngl==sumOfForDgnl)
        {
            System.out.println("Is a magic square");
        }
        else
        {
            System.out.println("Is not a magic square");
        }

    }
}