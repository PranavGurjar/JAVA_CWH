import java.util.Scanner;
public class sumrecnat {
        static int  sumrec(int n){
            if(n==1)
            {
                return 1;
            }
            else
            {
                return n + sumrec(n-1);
            }
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("The Number Of ");
            int num = in.nextInt();

            int result = sumrec(num);
            System.out.println("The Sum = "+result);


        }
    }


