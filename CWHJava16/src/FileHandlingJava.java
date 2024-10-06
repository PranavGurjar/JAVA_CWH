import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingJava {
    public static void main(String[] args) {

        //code to create new file
        File myFile = new File("file_handling.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to Create a File. ");
            throw new RuntimeException(e);
        }


        //code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("file_handling.txt");
            fileWriter.write("This is the Java Read Write from file handling \nOk Bye");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to Write a File. ");
            throw new RuntimeException(e);
        }

        //Reading a file
        File myFile1 = new File("samp.txt");

        try {
            Scanner sc1 = new Scanner(myFile1);
            while(sc1.hasNextLine()){
//                String line = sc1.nextLine();
//                System.out.println(line);
                System.out.println(sc1.nextLine());
            }
            sc1.close();

        } catch (FileNotFoundException e) {
            System.out.println("Unable to Read a File. ");
            throw new RuntimeException(e);
        }


        //Deleting a file
//        File myFile1 = new File("samp.txt");

//        if(myFile1.delete())
//        {
//            System.out.println("I have Delete : "+myFile1.getName());
//        }
//        else
//        {
//            System.out.println("Unable to Delete a File. ");
//        }
    }
}
