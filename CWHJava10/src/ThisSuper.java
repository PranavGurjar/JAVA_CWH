
class Oclass{
    private int a;

    public Oclass(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
    public int returnone(){
        return 1;
    }
}

class Tclass extends Oclass{
    public Tclass(int c){
        super(c);
        System.out.println("I am tclass constructor");
    }
}


public class ThisSuper {
    public static void main(String[] args) {
        Oclass o = new Oclass(4);
        System.out.println(o.getA());

        Tclass t = new Tclass(5);
        System.out.println(t.getA());
    }
}
