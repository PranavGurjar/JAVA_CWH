import java.util.Scanner;

public class NestedTry {
    public static void main(String[] args) {
        int []arr = new int[3];
        arr[0]=20;
        arr[1]=30;
        arr[2]=50;
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while(flag)
        {
            System.out.println("enter the number = ");
            int ind = in.nextInt();
            try{
                System.out.println("welcome to the MyWorld ");
                try{
                    System.out.println("the index value is = "+arr[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("exception level 2");
                    System.out.println(e);
                }
            }catch (Exception e){
                System.out.println("exception level 1");
                System.out.println(e);
            }
        }
        System.out.println("thank you sir");
    }
}
