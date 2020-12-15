package components;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static String readFile(String filePath) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
        StringBuilder stringBuffer = new StringBuilder();
        try  {
            String currentLine = fileReader.readLine();
            while (currentLine != null) {
                stringBuffer.append(currentLine);
                stringBuffer.append(System.lineSeparator());
                currentLine = fileReader.readLine();
            }
        } finally {
            fileReader.close();
        }
        return stringBuffer.toString();
    }

}
