
@FunctionalInterface
interface DemoAno{
    void meth1(int x);
//    void meth2();
}



//class LambdaExp implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("This is Method 1 ");
//    }
//}


//class AnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println(" i am meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println(" i am meth2");
//    }
//}

public class AnonymousClassAndLambdaExp {
    public static void main(String[] args) {
//        AnonyDemo an = new AnonyDemo();
//        an.meth1();

//        DemoAno an0 = new AnonyDemo();
//        an0.meth1();



        //Anonymous Class
//        DemoAno da = new DemoAno() {
//            //anonymous class
//            @Override
//            public void meth1() {
//                System.out.println(" i am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println(" i am meth2");
//            }
//        };
//        da.meth1();



        //Lambda Expression
//        DemoAno lex = new LambdaExp();
//        lex.meth1();

        DemoAno daLex = (x)->{
            System.out.println("this is lambda Exp. Method1 value is "+x);
        };
        daLex.meth1(5);


    }
}
