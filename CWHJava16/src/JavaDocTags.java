

/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * This is <i>italic</i> word<p>this is a new paragraph</p>
 * @author Harry (CodeWithHarry)
 * @version 0.1
 * @since 2002
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */


public class JavaDocTags {
    public static void add(int a, int b){
        System.out.println("Addition : "+ (a+b));
    }
    public static void main(String[] args) {
        System.out.println("this is JavaDocs Tags");
        add(3,4);
    }
}
