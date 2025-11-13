import java.io.*;

class FileHandler {
    FileHandler(String name) throws IOException {
        File f = new File(name);

        if(!f.exists())
            throw new IOException("File not found!");
    }
}
public class ConstructorPropagation {
    public static void main(String[] args) {

        try {
            FileHandler fh = new FileHandler("abc.txt");
            System.out.println("File opened.");
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
