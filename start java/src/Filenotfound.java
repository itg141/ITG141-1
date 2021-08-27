import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filenotfound {
    public static void main(String args[])  {
        try {

            File file = new File("E:/file.txt");
 
            FileReader fr = new FileReader(file);
        } catch (Exception e) {
           System.out.println("the given file is not their in your filed history");
        }
    }
}


