interface parent{
    void meth1();
    void meth2();
}

interface child extends parent{
    void meth3();
    void meth4();
}

class MyInterface implements child{
    @Override
    public void meth1() {
        System.out.println("method 1");
    }
    @Override
    public void meth2() {
        System.out.println("method 2");
    }
    public void meth3() {
        System.out.println("method 3");
    }
    public void meth4() {
        System.out.println("method 4");
    }
}


public class InheritanceInInterface {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface();

        System.out.println("Inheritance In Interface");

        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
