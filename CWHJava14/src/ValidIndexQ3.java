import java.util.Scanner;

public class ValidIndexQ3 {
    public static void main(String[] args) {
        int []arr = new int[3];
        arr[0]=20;
        arr[1]=50;
        arr[2]=60;
        boolean flag = true;
        int i=0;
        Scanner in = new Scanner(System.in);
        while (flag && i<5)
        {
            try{
                System.out.println("enter the index = ");
                int ind = in.nextInt();
                System.out.println("the index of "+ind+" the array value is "+arr[ind]);
                break;
            }
            catch(Exception e)
            {
                System.out.println("Invalid Value!");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}
