package CoreJavaYouTube.innerClass;

// creating a class with inner class
class Z{
    public void show(){
        System.out.println("In A show");
    }
}
public class Anonymousinner {
    public static void main(String a[]){
        Z obj = new Z(){
            public void show1(){
                System.out.println("In Anonymous inner");
            }
        };
        obj.show();
    }
}