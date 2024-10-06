import java.util.Scanner;

public class recursion {
    int recurv(int n){
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n * recurv(n-1);

        }
    }


    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        recursion obj1 = new recursion();

        System.out.println("enter the number = ");
        int num = ip.nextInt();

        System.out.println("the recursion of number " + num + " = " +obj1.recurv(num));
    }
}
