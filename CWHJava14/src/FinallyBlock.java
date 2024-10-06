public class FinallyBlock {
    public static int greet(){
        try{
            int a = 50;
            int b = 0;
            int c = a/b;
//            System.out.println(c);
            return c;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("I am a finally Block");
        }
        return -1;
    }
    public static void main(String[] args) {
//        int a = greet();
//        System.out.println(a);

        int a=100;
        int b=10;
        while(true){
            try{
                System.out.println("the division of a/b = "+a/b);
            }
            catch(Exception e)
            {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am Finally Keyword Block value of b = "+b);
            }
            b--;
        }

//        try{
//            System.out.println(50/10);
//        }
//        finally {
//            System.out.println("I am Finally Keyword");
//        }
    }
}
