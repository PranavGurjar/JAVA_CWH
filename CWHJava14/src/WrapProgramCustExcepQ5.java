import java.util.Scanner;

class MyExceptionQ5 extends Exception{
    @Override
    public String toString() {
        return "Q5 The Max Exception Occur";
    }

    @Override
    public String getMessage() {
        return "Q5 Max Retries Exception Are Reached ";
    }
}



public class WrapProgramCustExcepQ5 {

    //wrap this meth1 method in method
    public static void meth1(int i) throws MyExceptionQ5 {
        if (i >= 5) {
            throw new MyExceptionQ5();
        }
    }


    public static void main(String[] args){
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
//        if (i >= 5) {
//            System.out.println("Error");
        try {
            meth1(i);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}

