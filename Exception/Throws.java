package CoreJavaYouTube.Exception;
class A {
    public void show() throws ClassNotFoundException
    {
        Class.forName("Calc");
    }
}

public class Throws {
    static {
        System.out.println("Loaded Class.");
    }
    public static void main(String a[]) // throws ClassNotFoundException
            // giving exception to the main() is not a good idea so add try,catch
    {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
            System.out.println(e);
        }
        finally {
            System.out.println("Ended");
        }
    }
}
