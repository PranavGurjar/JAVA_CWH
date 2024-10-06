//Problem 1 Code with harry abstraction
abstract class Pen{
    abstract void refill();
    abstract void write();
}

//Problem 2 Code with harry create class fountainpen
class FountainPen extends Pen{
    @Override
    void refill(){
        System.out.println("refill");
    }

    @Override
    void write() {
        System.out.println("write");
    }

    void changeNib(){
        System.out.println("change nib");
    }
}


public class PenClass {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.changeNib();
        fp.refill();
    }
}
