package CoreJavaYouTube.objwithoutreference;

class A{
    // Constructor
    public A(){
        System.out.println("Object created");
    }
    {
        System.out.println("Instance Block");
    }
    static{
        System.out.println("Static block");
    }
    // Method
    public void abc(){
        System.out.println("Method 1");
    }
}
public class obj {
    public static void main(String a[]){
        // objects without reference are called 'Anonymous Object'
       // new A();
        new A().abc();
    }
}
