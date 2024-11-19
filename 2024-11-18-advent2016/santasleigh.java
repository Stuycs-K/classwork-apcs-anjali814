public class santasleigh{
  public static int easterBunnyHQ(String filename){
    int [] xcoordinate = {-1, 0, 1, 0}
    int [] ycoordinate = {0, 1, 0, -1}

    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      String direction = input.nextLine();

      for (i = 0; i < direction.length; i++){
        char turn = instructions.charAt(i);
        int steps = Integer.parseInt(instructions.substring(i+1));

    }


  }
}
