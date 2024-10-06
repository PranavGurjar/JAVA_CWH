import java.util.Scanner;

public class encrydecrytion {
    public static void main(String[]  args){
        System.out.println("encryption grade");
        Scanner sc = new Scanner(System.in);

//        System.out.println("enter the marks = ");
//        int a =sc.nextInt();
//
//        System.out.println("the marks = "+a);
//
//        int encry = a+8;
//
//        System.out.println("the encrpt marks is = "+encry);

        System.out.println("enter the grade = ");
        char a= sc.next().charAt(0);

        System.out.println(" the grade = " +a);

        System.out.println("encryption process");
        char b = (char)(a+8);
        System.out.println("encrypt the grade = " +b);

        System.out.println("descryption process");
        char c = (char)(b-8);
        System.out.println("encrypt the grade = " +c);

   }
}
