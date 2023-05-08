package CoreJavaYouTube.CreatingClass1;

import java.util.Scanner;
// creating a Computer Class

class Computer{
    public void playMusic(){
        System.out.println("Play Music.....");
    }
    public String getPen(int price){
        if(price >=10) return "Pen is Affordable."; 
        return "Pen is Not Affordable."; 
    }
    public int getPenPrice(int price){
        int fare = price-10; 
        return fare;
        
        
    }
}   
public class java2 { 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Accessing the Computer Class
        Computer obj = new Computer();
        obj.playMusic();
        //User input of Pen Price
        System.out.print("Enter the Payment Amount : "); 
        int price = sc.nextInt();
        sc.close();
        System.out.println(obj.getPen(price));
        if(obj.getPenPrice(price)<=0)
        System.out.println("To Afford Pen, Remaining Balance You have to Pay : "+(-1*(obj.getPenPrice(price))));
        else System.out.println("Your Remaining Balance : "+obj.getPenPrice(price));
        }
} 
