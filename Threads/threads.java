package CoreJavaYouTube.Threads;
// Creating Threads
class A extends Thread{
    public void run(){ // here when we extend the class with Threads then the mehtod should be run(); inspite of u r own
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
class B extends  Thread{
    public void run(){
       for(int i=0;i<=10;i++){
           System.out.println("Hello");
           try {
               Thread.sleep(10);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}

public class threads {
    public static void main(String a[]){
        A obj = new A();
        B obj1 = new B();
       // obj.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        obj1.start();
    }
}
