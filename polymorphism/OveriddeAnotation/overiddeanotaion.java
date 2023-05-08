package CoreJavaYouTube.polymorphism.OveriddeAnotation;
// @override annotation
class ShowMe{
    public void print(){
        System.out.println("In Show Me");
    }
}
class ShowMe1 extends ShowMe {
    public void print(){
        System.out.println("In Show Me1");
    }
}
public class overiddeanotaion {
    public static void main(String a[]){
        ShowMe obj1 = new ShowMe();
        obj1.print();
        ShowMe obj = new ShowMe1();
        obj.print();
        ShowMe obj2 = new ShowMe1();
        obj2.print();

    }
}
