package CoreJavaYouTube.NeedOfInterface;

interface Computer{
    void code();// default abstract public method
}
class laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run , code");
    }
}
class desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run , code : faster");
    }
}
class developer{
    public void devapp(Computer ask){ //ask is object of computer
         ask.code();// code is a method of Laptop and Desktop
    }
}

public class Interface {
    public static void main(String a[]){
        Computer lap = new laptop();//Interface reference
        Computer des = new desktop();
        developer code = new developer();
       // code.devapp(lap);
        code.devapp(des);
    }
}
