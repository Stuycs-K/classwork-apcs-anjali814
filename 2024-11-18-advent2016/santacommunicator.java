import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class santacommunicator{
  public static String communications (String filename){
    String password = "";

    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      ArrayList<String> lines = new ArrayList<>();

      while (input.hasNextLine()) {
        lines.add(input.nextLine());
      }
      input.close();

      int length = lines.get(0).length();

    }
  }
}
