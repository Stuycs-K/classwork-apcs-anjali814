public class bathroomsecurity{
  public static String bathroomCode(String filename){
    int [] xdirection = {0, 1, 0, -1}; //left right up down
    int [] ydirection = {1, 0, -1, 0};

    int x = 1;
    int y = 1;

    String code = "";

    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while (input.hasNextLine()){
      String direction = input.nextLine();
      for (int i = 0; i < instructions.length(); i++) {
        char move = instructions.charAt(i);
        int newX = x;
        int newY = y;







        if (newX >= 0 && newX < 3 && newY >= 0 && newY < 3) {
          x = newX;
          y = newY;
        }
    }
  }
}
