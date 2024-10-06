import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
       int [] arr = new int[3];

       arr[0] = 50;
       arr[1] = 60;
       arr[2] = 30;

        Scanner in = new Scanner(System.in);
        System.out.println("enter the index = ");
        int ind = in.nextByte();

        System.out.println("enter the value you want to divide = ");
        int num = in.nextInt();

        try{
            System.out.println("the index we choose = "+arr[ind]);
            System.out.println("the number divide = "+arr[ind]/num);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occur");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occur");
            System.out.println(e);
        } catch(Exception e) {
            System.out.println("Exception occur");
            System.out.println(e);
        }
    }
}
