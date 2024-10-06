class MyThreadQ31 extends Thread{
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

class MyThreadQ32 extends Thread{
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


public class ThreadQ3 {
    public static void main(String[] args) {
        MyThreadQ31 p1 = new MyThreadQ31();
        MyThreadQ32 p2 = new MyThreadQ32();

//        p1.setPriority(6);
//        p2.setPriority(9);

        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());

//        p1.start();
//        p2.start();
    }
}

