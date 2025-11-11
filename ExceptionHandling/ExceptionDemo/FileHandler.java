import java.io.*;
class FileHandler {
    public FileHandler(String fileName) throws IOException {
        File f = new File(fileName);
        if (!f.exists()) {
            throw new IOException("File not found!");
        }
        System.out.println("File opened.");
    }
}

public class FileTest {
    public static void main(String[] args) {

        try {
            FileHandler fh = new FileHandler("abc.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
