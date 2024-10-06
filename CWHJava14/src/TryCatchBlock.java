public class TryCatchBlock {
    public static void main(String[] args) {
        int a = 600;
        int b = 0;

        //without try
//        int c = a/b;
//        System.out.println(c);

        //with try
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println("we failed to divide : reason");
            System.out.println(e);
            System.out.println("end the program");
        }
    }
}
