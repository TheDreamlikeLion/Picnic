import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    private final String fileName;

    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    public String readData(){
        StringBuilder stringBuilder = null;

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader reader = new BufferedReader(fileReader)) {

            stringBuilder = new StringBuilder();
            String line;
            String ls = System.lineSeparator();
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла " + fileName + " :");
            System.out.println(e.getMessage());
        }
        if (stringBuilder == null) {
            System.out.println("Похоже, файл " + fileName + " пустой.");
            return "";
        }
        return stringBuilder.toString();
    }
}