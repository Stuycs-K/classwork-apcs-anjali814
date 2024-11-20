import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public static roomdecoy{
  public static int roomSectors (String filename){
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while (input.hasNextLine()){
        String line = input.nextLine();
        String[] sections = line.split("-");

        for (int i = 0; i < sections.length; i++){
          String section = sections[i];
          char part = section.charAt(0);
          int steps = Integer.parseInt(section.substring(1));
        }
      }
      input.close();
    } catch (FileNotFoundException e){
      System.out.println("File not found: " + filename);
      return 0;
    }
    return count;
  }


  public static void main(String[] args) {
    String filename = "inputDecoy.txt";
    System.out.println(roomSectors(filename));
  }
}
