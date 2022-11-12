import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) {

        // first we create new file
        // File myfile = new File("ashok_new_file.txt");
        // try {
        // myfile.createNewFile();
        // } catch (IOException e) {
        // System.out.println("unable to ceate this file ");
        // e.printStackTrace();
        // }

        // here we can write anythigs in file creating by our
        // try {
        // FileWriter myfile = new FileWriter("ashok_new_file.txt");
        // myfile.write("hello ashok ! how are you and how's your parent");
        // myfile.close();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // reading file
        File myfile = new File("ashok_new_file.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
