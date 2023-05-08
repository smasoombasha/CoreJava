package CoreJavaYouTube.Encapsulation;
// creating class
class Human1 {
    // creating instance variable with private access modifier
    private  int age;
    private String name;
    // creating constructors.
    // constructors itself looks like methods but, the difference is it doesn't specify any return type.
   /* public  Human(){ // default constructor. we dont want to create, it will create it self.
    }*/
    public Human1(){// if we want specify any data then we have to create constructor.
        age=101;
        name="Rangnarok";
    }
    public Human1(int age, String name){// Parameterized constructor.
       this.age=age;
       this.name=name;
    }
    // creating methods to access the private instances
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setname(String name){
        this.name=name;
    }
}

public class constructors {
    public static void main(String a[]){
        // creating an object
        Human1 obj1 = new Human1();
        Human1 obj = new Human1(21,"Masoom");
        System.out.println(obj1.getname()+" : "+obj1.getage());
        System.out.println(obj.getage()+" : "+obj.getname());
        obj.setname("Masoom");obj.setage(13);
        System.out.println(obj.getage()+":"+obj.getname());


    }
}
