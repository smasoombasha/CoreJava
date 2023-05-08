package CoreJavaYouTube.inheritance1.inheritanceType.code;

public class A  {
    public int age=90;
    // private age is used in only in same class
    private int age1= 50;
    protected int age2 =30;
}
class lunch extends A{
    public void abc(){
        // proteced age2
        System.out.println(age2);
    }
}