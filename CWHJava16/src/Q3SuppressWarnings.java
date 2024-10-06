
class MyDeprecated1{
    @Deprecated
    void meth1(){
        System.out.println("this is Method 1 Deprecated cover by SuppressWarnings");
    }
}


public class Q3SuppressWarnings {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        MyDeprecated1 m = new MyDeprecated1();
        m.meth1();
    }
}
