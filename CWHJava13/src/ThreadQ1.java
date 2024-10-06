class MyThreadQ1 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Good Morning.");
        }
    }
}

class MyThreadQ2 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Welcome sir.");
        }
    }
}


public class ThreadQ1 {
    public static void main(String[] args) {
        MyThreadQ1 p1 = new MyThreadQ1();
        MyThreadQ2 p2 = new MyThreadQ2();

        p1.start();
        p2.start();
    }
}
