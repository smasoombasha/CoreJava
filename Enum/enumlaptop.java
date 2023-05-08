package CoreJavaYouTube.Enum;
enum Laptop{
    Macbook(2000), Xps(1500), Lenovo, Asus(1600), Dell(1200);
    //here when we remove price of lenovo get error bcoz we don't have default constructor now. we create that
    //and lenovo default value be after creation of constructor is zero
    private int price;
    Laptop(){
       // price= 500;
    }
    private Laptop(int price){ // constructor
        this.price= price;
    }
    // if we want to return the prices of laptops then we use the getters and setters methods
    public int getprice(){
        return price;
    }
    public void setprice(){
        this.price= price;
    }
}
public class enumlaptop {
    public static void main(String a[]){
        Laptop obj = Laptop.Macbook;
        System.out.println(obj);
        System.out.println("Loops");
        /*Laptop[] loop = Laptop.values();
        for(Laptop s : loop){
            System.out.println(s+" : "+ s.getprice());
        }*/// in simple form
        for(Laptop s : Laptop.values()){
            System.out.println(s+" : "+ s.getprice());
        }

    }
}
