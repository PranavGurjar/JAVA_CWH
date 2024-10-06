import java.util.Scanner;

public class reverse10 {
        public static void main(String[] args) {
            Scanner k = new Scanner(System.in);

            System.out.println("enter the no for there table = \n");
            int t = k.nextInt();
            System.out.println("tabel of "+t);
            for (int i=10 ; i>0; i--)
            {
                System.out.printf("%d X %d = %d\n", t, i, i*t);
            }
        }
    }

