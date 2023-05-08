package CoreJavaYouTube.innerClass;

// creating a class with inner class
class A{
    public void show(){
        System.out.println("In A show");
    }
    static class B{
        public  void show(){
            System.out.println("Inner B show");
        }
    }
}
public class innerandAnonymous {
    public static void main(String a[]){
        A obj = new A();
        obj.show();
       // A.B obj1 = obj.new B();// calling inner class with reference of super class
        // Above one is for non static class
        A.B obj2 = new A.B();// this for static class
    }
}
