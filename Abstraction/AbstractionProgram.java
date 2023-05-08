package CoreJavaYouTube.Abstraction;
// Creating Abstraction Class
abstract class car{
    public abstract void drive();
    public abstract void motor();
    public void playmusic(){
        System.out.println("Music....");
    }
    public void acon(){
        System.out.println("Turn on Ac.");
    }
}
// Creating abstract class with super class of car
abstract class wagnor extends car{
    public void motor() {
        System.out.println("I know about motor");
    }
}
class updatedwagnor extends wagnor{
    public void drive(){
        System.out.println("I know how to drive");
    }

}
public class AbstractionProgram {
    public static void main(String a[]){
        car obj = new updatedwagnor();
        obj.drive();
        obj.motor();
        obj.playmusic();
    }
}
