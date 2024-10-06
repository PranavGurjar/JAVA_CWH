import java.util.Scanner;

class MyAgeException extends Exception{
    @Override
    public String toString() {
//        return super.toString()+" i am toString()";
        return " Age cannot be greater than 125yr. ";
    }

    @Override
    public String getMessage() {
//        return super.getMessage()+" i am getMessage()";
        return " filled the correct age.";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number = ");
        int a = in.nextInt();

        if(a<125)
        {
            try{
                //throw new MyException();
                throw new ArithmeticException("this is Exception of the age");
            }
            catch (Exception e)
            {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("finished");
            }
            System.out.println("yes finished");
        }
    }
}














//import java.util.Scanner;
//
//class MyException extends Exception{
//    @Override
//    public String toString() {
////        return super.toString()+" i am toString()";
//        return " i am toString()";
//    }
//
//    @Override
//    public String getMessage() {
////        return super.getMessage()+" i am getMessage()";
//        return " i am getMessage()";
//    }
//}
//
//public class ExceptionClass {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter the number = ");
//        int a = in.nextInt();
//
//        if(a<10)
//        {
//            try{
//                //throw new MyException();
//                throw new ArithmeticException("this is Arithmatic Exception");
//            }
//            catch (Exception e)
//            {
//                System.out.println(e.toString());
//                System.out.println(e.getMessage());
//                System.out.println(e);
//                e.printStackTrace();
//                System.out.println("finished");
//            }
//            System.out.println("yes finished");
//        }
//    }
//}
