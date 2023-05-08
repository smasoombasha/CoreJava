package CoreJavaYouTube.Threads;

/*
class E implements Runnable{ // runnable is a functional interface. which threads also implemets
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("HI");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class F implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("HEllo");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}*/

public class threadsWithLamda {
    public static void main(String a[]){
        Runnable obj =  () -> {
                for(int i=0;i<=10;i++){
                    System.out.println("HI");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }; // here we use Runnable bcoz it is inteface.
        Runnable obj1 = () -> {
            for(int i=0;i<=10;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
        };

        // Initializing obj's to threads
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }
}
