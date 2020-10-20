import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Util {
    public static String readFromUser(String message){
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    public static void writeToFile(String path, String text){
        try {
            FileWriter file=new FileWriter(path, true);
            file.append(text+"\n");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
