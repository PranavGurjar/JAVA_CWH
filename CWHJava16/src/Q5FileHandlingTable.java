import java.io.FileWriter;
import java.io.IOException;

public class Q5FileHandlingTable {
    public static void main(String[] args) {


        int num = 5;
        String table = " ";
        for (int i = 1; i < 11; i++) {
            table += "\n";
            table += num + " X "+i+" = "+(num*i);
//            table += "\n";
        }

        //code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to Write a File. ");
            throw new RuntimeException(e);
        }


    }
}
