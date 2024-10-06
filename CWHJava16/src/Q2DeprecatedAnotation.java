class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("this is Method 1 Deprecated");
    }
}


public class Q2DeprecatedAnotation {
//    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        MyDeprecated m = new MyDeprecated();
        m.meth1();
    }
}
