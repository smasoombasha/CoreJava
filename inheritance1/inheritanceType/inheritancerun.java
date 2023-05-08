package CoreJavaYouTube.inheritance1.inheritanceType;

import CoreJavaYouTube.inheritance1.inheritanceType.code.A;
import CoreJavaYouTube.inheritance1.inheritanceType.code.tools.VeryAdvCalc;

class Age extends A{
    protected int age3 = age2;
    public void lunch(){
        // age2 is protected in A class
        // protected variables can be used in same class, same package, and in other package but it should
        // subclass of parental class.
        System.out.println(age2);
    }
}
public class inheritancerun {
    public  static void main(String a[]){
        VeryAdvCalc obj = new VeryAdvCalc();
        Age obj1 = new Age();
        System.out.println(obj1.age3);
        int r1 = obj.add(2,3);
        int r2 = obj.sub(10,3);
        int r3 = obj.mul(3,3);
        int r4 = obj.div(25,3);
        double r5 = obj.add(2,3);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5+" ");
    }
}
