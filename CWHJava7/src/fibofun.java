import java.util.Scanner;

public class fibofun {

        static int  fib(int n){
		 /*if(n==1)
		 {
		 	return 0;
		 }
		 else if(n==2)
		 {
		 	return 1;
		 }*/
            if(n==1 || n==2)
            {
                return n-1;
            }
            else
            {
                return fib(n-1)+fib(n-2);
            }
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("The Number Of ");
            int num = in.nextInt();

            int result = fib(num);
            System.out.println("The fibonnacii series = "+result);


        }
    }


