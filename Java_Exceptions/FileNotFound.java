package Java_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class FileNotFound {
    public static void main(String args[])  {
        try {
            File file = new File("D://file.txt");
 
            FileReader fr = new FileReader(file);
            fr.getClass();

        } catch (FileNotFoundException e) {
           System.out.println("File does not exist");
        }
    }
}
