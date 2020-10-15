import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FileOperations {
    public static void writeDataToFile(String fileName, Object charFreq){
        File file = new File(fileName);
        FileWriter writeFile;
        try {
            file.createNewFile();
            writeFile = new FileWriter(fileName);
            writeFile.write(charFreq.toString());
            writeFile.close();
        }
        catch (IOException e){
            System.out.println("IO Exception occurred");
        }
    }
}
