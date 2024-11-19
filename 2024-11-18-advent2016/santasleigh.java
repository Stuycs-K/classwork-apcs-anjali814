public class santasleigh{
  public static int easterBunnyHQ(String filename){
    int [] xcoordinate = {-1, 0, 1, 0}
    int [] ycoordinate = {0, 1, 0, -1}

    int currentDirection = 0;

    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      String direction = input.nextLine();

      for (i = 0; i < direction.length; i++){
        char turn = instructions.charAt(i);
        int steps = Integer.parseInt(instructions.substring(i+1));
        if (turn == 'L') {
          currentDirection = (currentDirection + 3) % 4;
        } else if (turn == 'R') {
          currentDirection = (currentDirection + 1) % 4;
        }
        x += xcoordinate[currentDirection] * steps;
        y += ycoordinate[currentDirection] * steps;
      }
      input.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + filename);
      return 0;
    }  
  }
}
