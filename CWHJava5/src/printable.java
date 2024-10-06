import java.util.Scanner;

public class printable {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("enter the no for there table = ");
        int t = k.nextInt();
        System.out.println("tabel of "+t);
        for (int i=1 ; i<=10; i++)
        {
//            int t1 = i * t;
//            System.out.println(t1);

            System.out.printf("%d X %d = %d\n", t, i, i*t);
        }
    }
}
