import java.io.FileWriter;
import java.io.IOException;

public class Q6MultiplicationTable2to9 {
    public static void main(String[] args) {


        int a = 2;
        int b = 9;
        String table = " ";
        int i=a;

        while(i<=b){
            int j=1;
            table+= "Table of "+i+"\n";

            while(j<=10)
            {
                table+= i+ " X " +j+ " = " +(i*j)+ "\n";
                j++;
            }

            i++;
            table+= "\n";
        }

        //code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("multiplication_table_2to9.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to Write a File. ");
            throw new RuntimeException(e);
        }


    }
}










//
//import java.io.FileWriter;
//
//public class Q6MultiplicationTable2to9 {
//    public static void main(String[] args) {
//        int a=1;
//        int b=10;
//        String table= "";
//        int i=a;
//        while (i<=b) {
//            int j=1;
//            table+= "Multiplication Table of: " + i + "\n";
//            while (j<=10) {
//                table+= i + "X" + j + " = " + i*j + "\n";
//                j++;
//            }
//            table+= "\n";
//            i++;
//        }
//
//
////        File myFile = new File("multiplication_table_2to9.txt");
//        try {
//            FileWriter fw= new FileWriter("multiplication_table_2to9.txt");
//            fw.write(table);
//            fw.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}