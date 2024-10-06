
import java.util.Scanner;

public class tablefunc {
    static void table(int no){

            for(int i=1; i<=10;i++){
                System.out.println(i *no);
            }
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("The Table Of ");
            int num = in.nextInt();

            table(num);

        }
    }