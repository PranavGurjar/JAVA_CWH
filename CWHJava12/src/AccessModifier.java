class C1{
    public int a=10;
    protected int b=20;
    int c=30;
    private int d=40;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        C1 c = new C1();
        //using class
        //c.meth1();

        //using packages
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        //System.out.println(c.d);
    }
}

/*
access modifier

            class          packages          subclass          world

public        y               y                 y                y

protected     y               y                 y                n

default       y               y                 n                n

private       y               n                 n                n



 */