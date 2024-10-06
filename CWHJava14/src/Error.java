import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        //syntax error
//        int a = 10
//        int b = 20;
//        c = 9;
//        System.out.println(a+b);

        //logical error
        //print prime number 1 to 10
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2*i+1);
        }


        //runtime error
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("the number is divided = "+1000/n);
    }
}