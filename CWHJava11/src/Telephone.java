//Problem 4 class SmartPhone and Telephone

abstract class M1Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class M1SmartPhone extends M1Telephone{
    public void ring(){
        System.out.println("ringing ..");
    }
    public void lift(){
        System.out.println("lifting ..");
    }
    public void disconnect(){
        System.out.println("disconnect ..");
    }
    public void gps(){
        System.out.println("gps location...");
    }
}

public class Telephone {
    public static void main(String[] args) {
        System.out.println("-------class Smartphone---------");
        M1SmartPhone ms = new M1SmartPhone();
        ms.ring();
        ms.lift();
        ms.disconnect();
        ms.gps();

        System.out.println("-------Polymorfism of class telephone------");
        M1Telephone tp = new M1SmartPhone();
        tp.disconnect();
        tp.lift();
        tp.ring();
        //tp.gps();  ---showing the error

    }
}
