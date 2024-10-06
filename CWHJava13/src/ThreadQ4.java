class MyThreadQ41 extends Thread{
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

class MyThreadQ42 extends Thread{
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


public class ThreadQ4 {
    public static void main(String[] args) {
        MyThreadQ41 p1 = new MyThreadQ41();
        MyThreadQ42 p2 = new MyThreadQ42();

//        p1.setPriority(6);
//        p2.setPriority(9);

        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());

//        p1.start();
        p2.start();
        System.out.println(p2.getState());
    }
}

