class NegativeException extends Exception{
    @Override
    public String toString() {
        return "Negative value is not allow";
    }

    @Override
    public String getMessage() {
        return "This Is Nagative Exception";
    }
}




public class ThrowsThrow {
    public static double areaCircle(int r) throws NegativeException{
        if(r<0)
        {
            throw new NegativeException();
        }
        double ar = Math.PI*r*r;
        return ar;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {

//        try{
//            int c = divide(6,0);
//            System.out.println(c);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }




        try{
            double cArea = areaCircle(-6);
            System.out.println(cArea);
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println("Exception");
        }





//        double cArea = 0;
//        try {
//            cArea = areaCircle(6);
//        } catch (NegativeException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(cArea);



    }
}
