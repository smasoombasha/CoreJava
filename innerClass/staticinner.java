package CoreJavaYouTube.innerClass;
// creating a class with inner class
class C {
    public void show(){
        System.out.println("In A show");
    }
   static class B{
        public void show(){
            System.out.println("Inner B show");
        }
    }
}
public class staticinner {
    public static void main(String a[]){
        C obj = new C();
        obj.show();
        C.B obj1 = new C.B();
        obj1.show();
    }
}
