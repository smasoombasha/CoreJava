package CoreJavaYouTube.polymorphism;
// Polymorphism is concept which performs single a action in different
// polymorphism: the word polymorphism means having many forms. In simple words, we define polymorphism as ability
// of message to be displyed in more than one form. there are two types. 1. compile time 2. Runtime polymorphism
//1.Compile time polymorphism is know as static polymorphism. And this achieved from function overloading or method
public class compiletime {
    // Methods or Functions
    public static int add(int n1,int n2){
        return n1+n2;
    }
    public static int add(int n1,int n2, int n3){
        return n1+n2+n3;
    }
    public static int add(int n1, int n2, int n3, int n4){
        return n1+n2+n3+n4;
    }
    public static void main(String a[]){
        // calling a Method by passing arguements
        System.out.println(compiletime.add(9,5,4,4));
        System.out.println(compiletime.add(9,5,4));
        System.out.println(compiletime.add(9,7,4));
    }
}
