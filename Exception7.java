import java.io.FileReader;
import java.io.IOException;

public class Exception7 {

    static void readFile() throws IOException {
        FileReader file =new FileReader("abc.txt");
    }

    public static void main(String[] args) {
        
        try {
            readFile();
        }
        catch (IOException e) {
            System.out.println("file not found");
        }
    }
}