package CoreJavaYouTube.MethodOverLoading;
//Creating class
class addition{
    // Addition for two values
    public int add(int n1, int n2){
        return n1+n2;
    }
    // Addition for three values
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    // Addition for four values
    public int add(int n1, int n2, int n3, int n4){
        return n1+n2+n3+n4;
    }
}


public class methodOverLoading {
    public static void main(String args[]){
        // Creating Object
        addition obj = new addition();
        System.out.println("Addition : "+obj.add(3, 4, 6, 7));
        System.out.println("Addition : "+obj.add(3, 4, 4));
        System.out.println("Addition : "+obj.add(4, 5));
    }
}
