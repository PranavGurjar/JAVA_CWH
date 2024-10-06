class MyRunnable1 implements Runnable {
    public void run(){
        int i = 1;
        while(i<=10)
        {
            System.out.println("i am thread 1 is runnable ");
            i++;
        }
    }
}

class MyRunnable2 implements Runnable {
    public void run(){
        int i = 1;
        while(i<=10)
        {
            System.out.println("i am thread 2 is runnable ");
            i++;
        }
    }
}



public class RunnableSamp {
    public static void main(String[] args) {
        MyRunnable1 bullet1 = new MyRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyRunnable2 bullet2 = new MyRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
