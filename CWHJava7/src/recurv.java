import java.util.Scanner;


import java.util.Scanner;

public class recurv {
    int recur(int n){
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            int product = 1;
                    for(int i = 0; i<= n ; i++ )
                    {
                        product *= i;
                    }
            return product;
        }
    }


    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        recurv obj1 = new recurv();

        System.out.println("enter the number = ");
        int num = ip.nextInt();

        System.out.println("the recursion of number " + num + " = " +obj1.recur(num));
    }
}
