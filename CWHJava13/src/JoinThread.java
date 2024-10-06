class MyNewThread1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<10)
        {
            System.out.println("Hello, I am Thread Join 1");
            i++;
        }
    }
}

class MyNewThread2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<10)
        {
            System.out.println("Thank you, I am Thread Join 2");
            i++;
        }
    }
}



public class JoinThread {
    public static void main(String[] args) {
        MyNewThread1 m1 = new MyNewThread1();
        MyNewThread2 m2 = new MyNewThread2();

        //Thread Join Method
        m1.start();
        try {
            m1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        m2.start();
    }
}
