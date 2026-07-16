import java.io.FileReader;
import java.io.IOException;

public class Exception14 {

    static void readFile() throws IOException{
        FileReader file= new FileReader("abc.txt");
    }
    public static void main(String[] args) {
        
        try {
            readFile();
        }
        catch (IOException e) {
            System.out.println("File not found");
        }

        System.out.println("program end");
    }
    
}
