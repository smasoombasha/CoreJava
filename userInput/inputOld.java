package CoreJavaYouTube.userInput;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputOld {
    public static void main(String a[]) throws IOException{ // exception throws to main
        System.out.print("Enter the num : ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int num = Integer.parseInt(br.readLine());
        System.out.println(num);
        br.close();
    }
}*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputOld {
    public static void main(String a[]) throws NumberFormatException, IOException {
        System.out.print("Enter the num : ");
        int num;
        BufferedReader br = null;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally {
            br.close();
        }


    }
}
