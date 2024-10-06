class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    public void run(){
        int i=0;
        while(i<2)
        {
            System.out.println("hello i am thread for string name");
            i++;
        }
    }
}


public class StringNameThr {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Pranav");
        t1.start();
        System.out.println("the id of the given thread is "+t1.getId());
        System.out.println("the name of the given thread is "+t1.getName());

        MyThr t2 = new MyThr("Arnav");
        t2.start();
        System.out.println("the id of the given thread is "+t2.getId());
        System.out.println("the name of the given thread is "+t2.getName());
    }
}
