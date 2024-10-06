//public class foo {
//    //method overloding
//    //parameter of foo()
//    static void foo(){
//        System.out.println("hello");
//    }
//    static void foo(int a){
//        System.out.println("hello " +a);
//    }
//    static void foo(int a, int b){
//        System.out.println("hello " +a+ " and " +b);
//    }
//
//
//    public static void main(String[] args) {
//        foo();
//        foo(3000);
//        foo(300, 400);
//        //argument are actual
//    }
//}

public class foo {
    //method overloding
    //parameter of foo()
    static void foo(){
        System.out.println("hello");
    }
    static void foo(int a){
        System.out.println("hello " +a);
    }
    static void foo(int a, int b){
        System.out.println("hello " +a+ " and " +b);
    }

    static void num(int [] arr){
        arr[0] = 98;
    }


    public static void main(String[] args) {
        int [] marks = {50, 40, 30, 56, 45};
        num(marks);
        System.out.println("the change marks " + marks[0]);


        foo();
        foo(3000);
        foo(300, 400);
        //argument are actual
    }
}
