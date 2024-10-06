@FunctionalInterface
interface MyFunctionalInterface{
    void thisMethod1();
//    void thisMethod2();
}

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class NewPhone extends Phone{
    @Override
    public void showTime() {
        System.out.println("this is 8PM ");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class JavaAnnotation {
    @SuppressWarnings("deprecation")      //hide the deprecation
    public static void main(String[] args) {
        NewPhone np = new NewPhone();
        np.showTime();
        np.sum(5,6);
    }
}
