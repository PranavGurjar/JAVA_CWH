
/**
 * this is the good class
 */

public class Q1JavaDocRun {
    /**
     *
     * @param args these argument in command line
     */
    public static void main(String[] args) {
        System.out.println("the main method");
    }

    /**
     *hello this is the method tag of the class
     * @param i it is first number for argument
     * @param j it is second number for argument
     * @return return the sum of the two number
     * @throws Exception if i is 0
     * @deprecated these method is deprecate please use + operator
     */
    public int add(int i, int j) throws Exception{
        if(i==0)
        {
            throw new Exception();
        }
        int c;
        c=i+j;
        return c;
    }
}

