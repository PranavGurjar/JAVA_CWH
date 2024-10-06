class PriThread extends Thread{
    public PriThread(String name){
        super(name);
    }

    @Override
    public void run() {
        int i=0;
        while(i<100)
        {
            System.out.println("Thank You From Thread "+this.getName());
            i++;
        }
    }
}


public class ThreadPriority {
    public static void main(String[] args) {
        PriThread p1 = new PriThread("Pranav");
        PriThread p2 = new PriThread("Yash");
        PriThread p3 = new PriThread("Kunal");
        PriThread p4 = new PriThread("Sujal");
        PriThread p5 = new PriThread("Om");

        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);
        p3.setPriority(Thread.MIN_PRIORITY);
        p4.setPriority(Thread.MIN_PRIORITY);
        p5.setPriority(Thread.MIN_PRIORITY);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

    }
}
