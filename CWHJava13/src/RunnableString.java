class MyRunStr extends Thread{
    public MyRunStr(Runnable r, String name){
        super(r,name);
    }

    @Override
    public void run() {
        int i = 0;
        while(i<5){
            System.out.println("i am from runnable String ");
            i++;
        }
    }
}



public class RunnableString {
    public static void main(String[] args) {
        Runnable r = new MyRunStr(null,"Arnav");
        MyRunStr mrs1 = new MyRunStr(r,"pranav");

        mrs1.start();
        System.out.println("the id of thread is "+mrs1.getId());
        System.out.println("the name of thread is "+mrs1.getName());

        //runnable process from thread using mrs1
        Thread t1 = new Thread(mrs1);
        t1.start();
        System.out.println("the id of thread is runnable "+t1.getId());
        System.out.println("the name of thread is runnable "+t1.getName());

        //runnable process from thread using r
        Thread t2 = new Thread(r);
        t2.start();
        System.out.println("the id of thread is runnable "+t2.getId());
        System.out.println("the name of thread is runnable "+t2.getName());
    }
}




