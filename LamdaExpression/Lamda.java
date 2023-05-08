package CoreJavaYouTube.LamdaExpression;
// Creating FunctionalInterface
@FunctionalInterface// Anotation
interface Addition{
    int add(int n1, int n2);
}
@FunctionalInterface
interface Show{
    void show();
}
@FunctionalInterface
interface Num{
    void Number(int i);
}
/*class Addition1 implements Addition{
    public int add(int n1, int n2){
        return n1+n2;
    }
}
class Showing implements Show{
    public void show(){
        System.out.println("In a Show");
    }
}*/
public class Lamda {
    public static void main(String a[]){
        /*Addition obj = new Addition1(){
            public int add(int n1, int n2){
                return n1+n2;
            }                                   // without lamda Expression
        };
        System.out.println(obj.add(4,5));*/
        Addition obj = (i,j)-> i+j;     // Lamda Expression
        System.out.println(obj.add(5,6));
        //Show obj1 = () -> System.out.println("Show");
        Show obj1 = () -> System.out.println("Inshow");
        obj1.show();
        Num obj2 = (i) -> System.out.println(i);
        obj2.Number(8768);
    }
}
