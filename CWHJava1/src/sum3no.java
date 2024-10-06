import java.util.Scanner;

public class sum3no {
    public static void main(String args[]){
        System.out.println("sum of three no");

        Scanner s = new Scanner(System.in);

        System.out.println("enter 1 no ");
        int a = s.nextInt();

        System.out.println("enter 2 no ");
        int b = s.nextInt();

        System.out.println("enter 3 no ");
        int c = s.nextInt();

        int r=a+b+c;

        System.out.println("result = " +r);
    }
}
