package CoreJavaYouTube.Array;
import java.util.Scanner;
public class MultiDimenArray { 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Asking size of an array
        System.out.println("Enter rows and columns for array : ");
        int n=sc.nextInt(),m=sc.nextInt();
        int nums[][]=new int[n][m]; 
        System.out.println("Enter the "+n*m+" values into nums array : ");
        for(int i=0;i<n;i++) for(int j=0;j<m;j++)nums[i][j]=sc.nextInt();
        // Printing the MultiDimensionalArray
        
        /*for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(" "+nums[i][j]);
            }
            System.out.println();
        }*/

        sc.close();
        for(int i[]:nums){// enhenced for loop
            for(int j:i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
