package CoreJavaYouTube.Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String args[]){
        int nums[]={1,2,3,4};
        for(int i=0;i<4;i++)System.out.println(nums[i]);

        // Array values by taking input from user
        int n =4;
        int nums1[]=new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the four elements into array nums1 : ");
        for(int i=0;i<4;i++)nums1[i]= sc.nextInt();
        for(int i=0;i<4;i++)System.out.println(nums1[i]);
        sc.close();

    }
    
}
