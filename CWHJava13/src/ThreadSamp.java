
class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<=10) {
            System.out.println("Thread From 1 Chatting");
            System.out.println("i am Happy");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<=10)
        {
            System.out.println("Thread From 2 Cooking");
            System.out.println("i am Sad");
            i++;
        }
    }
}





public class ThreadSamp {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();

        mt1.start();
        mt2.start();
    }
}


