package CoreJavaYouTube.Threads;

public class threadsLamda1 {
    public static void main(String a[]){
        Runnable obj = () -> {
                for(int i=0;i<=10;i++){
                    System.out.println("HI");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }; // here we use Runnable bcoz it is inteface.
        Runnable obj1 =() -> {
                for(int i=0;i<=10;i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(10); // here thread sleep creates interrupted exception so thats why we use try,catch
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
