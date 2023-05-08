package CoreJavaYouTube.Interface;
// Interface is abstract class default
// interface have final and static variables default
interface A{
    int age=12;// variable compulsory we have to declare bcoz they are final and static by default
    void drive();
    void motorepair();
}
interface  B{
    void punchar();
}
class D implements A,B{
    public void drive() {
        System.out.println("I know how to drive");
    }
    public void motorepair() {
        System.out.println("I know how to moto repair");
    }
    public void punchar() {
        System.out.println("I know how to punchar tyre");
    }
}
public class Interface {
    public static void main(String a[]){
        A obj =new D();
        obj.drive();
        obj.motorepair();
        B obj1 = new D();
        obj1.punchar();
    }
}
