import java.util.Scanner;

    public class SumOfNaturalNumber {
        // Iterative method to calculate the sum of first n natural numbers
        static int sumIterative(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int num = in.nextInt();

            if (num > 0) {
                int sum = sumIterative(num);
                System.out.println("The sum of the first " + num + " natural numbers is: " + sum);
            } else {
                System.out.println("Please enter a positive integer.");
            }

        }
    }

