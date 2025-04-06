import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class in_out_file {
    public static void main(String[] args) {
        String filePath = "input.txt"; // Đường dẫn file

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
