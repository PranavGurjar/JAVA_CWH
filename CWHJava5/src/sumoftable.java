import java.util.Scanner;

public class sumoftable {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("enter the no for there table = ");
        int t = k.nextInt();
        int sum=0;
        System.out.println("tabel of "+t);
        for (int i=1 ; i<=10; i++)
        {
            sum =sum + (i*t);
        }
        System.out.println(sum);
    }
}