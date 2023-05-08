package CoreJavaYouTube.Array;

import java.util.Scanner;

public class forEachLoop {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : "); 
        int n= sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the "+n+" elements into the array");
        for(int i=0;i<array.length;i++)array[i]= sc.nextInt();
        sc.close();
        // Enhanced forloop
        for(int i:array)System.out.print(" "+i);
    }
}
