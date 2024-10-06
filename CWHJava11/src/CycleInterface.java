

interface Bicycle{
    int a = 20;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface Horn{
    void blowHorn1();
    void blowHorn2();
}

class AvonCycle implements Bicycle, Horn{
    public void applyBreak(int increment){
        System.out.println("Apply Break ");
    }
    public void speedUp(int decrement){
        System.out.println("Apply Speed Up ");
    }
    public void blowHorn1(){
        System.out.println("horn 1 = pee pee pee pee");
    }
    public void blowHorn2(){
        System.out.println("horn 2 = poo poo poo poo ");
    }
}




public class CycleInterface {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();

        System.out.println(ac.a);

        ac.applyBreak(3);

        ac.speedUp(2);

        ac.blowHorn1();

        ac.blowHorn2();

    }
}
