class MyThreadQ51 extends Thread{
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

class MyThreadQ52 extends Thread{
    @Override
    public void run() {
//        while(true){
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome sir.");
//        }
    }
}


public class ThreadQ5 {
    public static void main(String[] args) {
        MyThreadQ51 p1 = new MyThreadQ51();
        MyThreadQ52 p2 = new MyThreadQ52();

//        p1.setPriority(6);
//        p2.setPriority(9);

        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());

//        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}

