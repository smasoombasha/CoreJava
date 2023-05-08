package CoreJavaYouTube.CreatingClass;

// creating a Class
class Calculator{
   private int age;// instance variable with private acess modifier
    public int add(int n1, int n2){
        int r = n1+n2;
        return r;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Subraction{
    public int sub(int n1,int n2){
        int r = n1 - n2;
        return r;
    }
} 
public class java1 {
    public static void main(String args[]){
        int num1=5;
        int num2= 4;
        Calculator calc= new Calculator();
        Subraction subs= new Subraction();
    
      //  int result = calc.add(num1,num2);
        int result1 = subs.sub(num1, num2);
        System.out.println("Addition two values :"+calc.add(num1,num2));
        System.out.println("Subraction of two values :"+result1);
        // Encapsulation
        calc.setAge(50);
        System.out.println(calc.getAge());

        }
} 
