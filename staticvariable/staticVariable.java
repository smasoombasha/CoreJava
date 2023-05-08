package CoreJavaYouTube.staticvariable;

class Mobile{
    String brand;
    int price;
    static String name;
    // Constructor
    public  Mobile(){
        brand="";
        price=200;
        System.out.println("In the constructor block");
    }
    // for name we use the static block bcoz we dont want to change the name all time. we want it has a constant
    static {
        name="SmartPhone";
        System.out.println("In the static block");
    }
    public  void show(){
        System.out.println("Brand : "+brand+". Price : "+price+". Name : "+name);
    }
    // Static Method
    public static void show1(Mobile obj){
        System.out.println("Brand : "+obj.brand+". Price : "+obj.price+". Name : "+name);
    }
}
public class staticVariable {
    public static void main(String args[]) throws ClassNotFoundException{
        Mobile obj1 = new Mobile();
        obj1.brand="Apple";
        obj1.price=1800;
        Mobile.name="Iphone13";

        Mobile obj2 =new Mobile();
        obj2.brand="Samsung";
        obj2.price=1500;
        Mobile.name="SamsungS20";
        Mobile.name = "Masoom Basha";

        obj1.show();
        obj2.show();
        // static method
        Mobile.show1(obj2);
        // Loading the class
        //Mobile obj1= new Mobile();
        // the class not times
         // Class.forName("Mobile");
    }
}
