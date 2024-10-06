import java.util.Scanner;

public class solveexp {
    public static void main(String[] args){
        System.out.println("Solve  the expression ");
        Scanner i = new Scanner(System.in);
        System.out.println("enter v's value = ");
        int v = i.nextInt();

        System.out.println("enter u's value = ");
        int u = i.nextInt();

        System.out.println("enter a's value = ");
        int a = i.nextInt();

        System.out.println("enter s's value = ");
        int s = i.nextInt();

        double exp1 = (v*v - u*u)/(2.0*a*s);

        System.out.println("result = "+exp1);


    }
}
