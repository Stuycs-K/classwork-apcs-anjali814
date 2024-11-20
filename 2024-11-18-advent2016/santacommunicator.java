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

      for (int i = 0; i < length; i++) {
        int[] freq = new int[26];

        for (int j = 0; j < lines.size(); j++) {
          char c = lines.get(j).charAt(i);
          freq[c - 'a']++;


        int maxFreq = 0;
        char mostFrequentChar = 'a';
        for (int k = 0; k < 25; k++) {
          if (freq[k] > maxFreq) {
            maxFreq = freq[k];
            mostFrequentChar = (char) (k + 'a');
          }
        }
      }
        message += mostFrequentChar;

    }
    return password;
  }
}
