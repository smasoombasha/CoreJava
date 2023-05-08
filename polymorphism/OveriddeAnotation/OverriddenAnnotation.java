package CoreJavaYouTube.polymorphism.OveriddeAnotation;
abstract class OveriddenBase{
    void show(){
        System.out.println("Base show method");
    }

    abstract void show1();
}
class OverriddenChild extends OveriddenBase{
    @Override
    void show1(){
        System.out.println("Chile show method");
    }
    @Override
    void show(){
        System.out.println("Child show method");
    }
}
public class OverriddenAnnotation {
    public static void main(String... a){
        OverriddenChild oc = new OverriddenChild();
        oc.show();
    }

}
