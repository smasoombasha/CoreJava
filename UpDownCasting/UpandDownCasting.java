package CoreJavaYouTube.UpDownCasting;

class A{// Parent
    public void show(){
        System.out.println("In A show");
    }
    public void show1(){
        System.out.println("In A show1");
    }
}
class B extends A{ // Child
    public void show(){
        System.out.println("In B show");
    }
}
public class UpandDownCasting {
    static {
        System.out.println("Main Loaded");
    }
    public static void main(String a[]){
        // Up Casting is parent reference and child object
      /*  A obj = (A)new B();// up Casting. we don't have to write A in object, boz it have by default
        obj.show();// here object of B is overriding the A object.
        // Down Casting is have a object of A, then we casting it as to change to B
        B obj1 = (B) obj;
        obj1.show(); */
        A obj = new B();// upcasting
        obj.show();// here in upcasting we taking the object reference from the A(parent) to create B object

        B obj1 =  (B) obj;// Down casting
        //obj.show();// here downcasting we obj(reference of A) and we cast it with B(child)
        // allowed bcoz A(parent) refers child
        obj1.show1();
    }
}
