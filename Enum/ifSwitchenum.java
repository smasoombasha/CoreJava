package CoreJavaYouTube.Enum;

import java.util.Scanner;

enum Statuss{
    Coding, Compile, Running, Failed , Success;
}
public class ifSwitchenum {
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Statuss s = Statuss.Failed;
        //System.out.println(s);
        //System.out.println(s.ordinal());
        // if else statement
        /*if(s == Statuss.Coding){
            System.out.println("The developers are coding");
        }else if(s == Statuss.Compile){
            System.out.println("The developers are testing");
        }else if(s == Statuss.Running){
            System.out.println("The developers are Running success");
        }else if(s == Statuss.Failed){
            System.out.println("The developers are Running failed");
        }else{
            System.out.println("The developers are Successfully completed");
        }*/
        switch(s){
            case Coding:  System.out.println("The developers are coding");
            break;
            case Compile:System.out.println("The developers are testing");
                break;
            case Running:System.out.println("The developers are Running success");
                break;
            case Failed: System.out.println("The developers are Running failed");
                break;
            default: System.out.println("The developers are Successfully completed");
                break;
        }
    }
}

