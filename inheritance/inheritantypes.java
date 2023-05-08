package CoreJavaYouTube.inheritance;
// creating class
/*class Subclass-name extends Superclass-name
{
   //methods and fields
} */
// inheritance : is a mechanism that acquires all the properties and behavior of parental object.
// here every class in java extends 'Object' class
// like 'class A extends Object' we don't have to mention
class A{
    public A(){
        super();// the super(); is tool which is defined already. if we want to specify order then we have to create super();
        System.out.println("IN A");
    }
    public A(int n){
        super();
        System.out.println("Int A");
    }
}
// single inheritance
class B extends A{// child of A
    public B(){
       //  super(5); only to execute like this output Int A
        //                                             IN B
        super();
        System.out.println("IN B");
    }
    public B(int n){
        //super(); inspite of super(); tool,if we write this(); it will call or execute the constructor of same class
        this();
        System.out.println("Int B");
    }
}
// multiLevel inheritance
class C extends B{// child of B
    public C(){
        System.out.println("IN C");
    }
    public C(int n){
        System.out.println("INT C");
    }
}
public class inheritantypes {
    public static void main(String a[]){
        /*A obj = new A(2);
      output  Int A*/

      /*  B obj = new B(2);
    output  IN A
            Int B*/

   /*     B obj = new B();
        output IN A
               IN B*/
      /*  B obj = new B();
        output Int A
                IN B  // if we give an num to super(); of B class it will call super class which having a int n*/
     /*   B obj = new B(2);
        output IN A
               IN B
               Int B
*/
     /*   B obj = new B(5); // as like this come out when use the this(); and initializing the num to first constructore
        output  Int A
                IN B
                Int B*/

    }
}
