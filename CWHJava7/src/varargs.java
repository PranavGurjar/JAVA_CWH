public class varargs {
    //varargs
    static int sum(int ...arr){
        int result=0;
        for(int a: arr)
        {
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("the sum of the num 1, 2 & 3 = "+sum( 1, 2, 3));
        System.out.println("the sum of the num 1, 2, 3 & 4 = "+sum( 1, 2, 3, 4));
        System.out.println("the sum of the num 1, 2, 3, 4 & 5= "+sum( 1, 2, 3, 4 ,5));
    }
}
