package CoreJavaYouTube.polymorphism;
// Runtime polymorphism is also know as Dynamic method dispatch. Runtime polymorphism is achieved from the call to an
// overidden function and resolved at runtime rather than compile time
// In this process overidden method is called by the reference of super class.
class A{
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}
class C extends A{
    public void show(){
        System.out.println("In C show");
    }
}
public class runtime {
    public static void main(String a[]){
        A obj =new C();// Creating'A' Object
        obj.show();// Overriding A show by reference of A by subclass C
        obj = new B();// Creating object with A reference
        obj.show();// Overriding A show by reference of A by subclass B
    }
}
