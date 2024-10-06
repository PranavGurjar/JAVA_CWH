class MyNewThr1 extends Thread{
    @Override
    public void run() {

        while (true)
        {
            System.out.println("Thread Intrupt 1 , Hello Pranav");
            try {
                Thread.sleep(9000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class MyNewThr2 extends Thread{
    @Override
    public void run() {

        while (true)
        {
            System.out.println("Thread Intrupt 2 , Hello Rajesh");
        }

    }
}



public class IntruptTheads {
    public static void main(String[] args) {
        MyNewThr1 m1 = new MyNewThr1();
        MyNewThr2 m2 = new MyNewThr2();

        m1.start();

        m2.start();
    }
}
















/*

class MyNewThr1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<50)
        {
            System.out.println("Thread Intrupt 1 , Hello Pranav");
            try {
                Thread.sleep(9000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<50)
        {
            System.out.println("Thread Intrupt 2 , Hello Rajesh");
            i++;
        }

    }
}



public class IntruptTheads {
    public static void main(String[] args) {
        MyNewThr1 m1 = new MyNewThr1();
        MyNewThr2 m2 = new MyNewThr2();

        m1.start();

        m2.start();
    }
}

*/
