
class MyThreadQ21 extends Thread{
    @Override
    public void run() {
        while(true){
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
            System.out.println("Good Morning.");
        }
    }
}

class MyThreadQ22 extends Thread{
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome sir.");
        }
    }
}


public class ThreadQ2 {
    public static void main(String[] args) {
        MyThreadQ21 p1 = new MyThreadQ21();
        MyThreadQ22 p2 = new MyThreadQ22();

        p1.start();
        p2.start();
    }
}
