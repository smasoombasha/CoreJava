package CoreJavaYouTube.Encapsulation;

// Creating a class
class Human{
    // creating instance variables with private access modifier
    private String name;
    private int age;
    // we access this private instance variables by creating methods
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;// here 'this' is keyword which represents the current object. which means object of calling method.
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
}
public class privatevariables {
    public static void main(String a[]){
        //creating an object
        Human1 obj1 = new Human1();
        obj1.setage(22);
        obj1.setname("Masoom");
        System.out.println(obj1.getage());
        System.out.println(obj1.getname());

    }
}
