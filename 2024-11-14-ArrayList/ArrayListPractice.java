import java.util.ArrayList;

public class ArrayListPractice{
  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> list = new ArrayList<> ();

    for (int i = 0; i < size; i++){
    int num = (int) (Math.random() * 11);
    if (num == 0){
      list.add("");
    } else {
      list.add("" + num);
    }
  }
  return list;
}

  public static void replaceEmpty( ArrayList<String> original){
  for (int i = 0; i < original.size(); i++){
    if (original.get(i).equals ("")) {
      original.set(i, "Empty");
    }
  }
}

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    ArrayList<String> list = new ArrayList<> ();
    for (int i = original.size() - 1; i >= 0; i--) {
      list.add(original.get(i));
    }
    return list;
  }

  public static ArrayList<String> mixLists(ArrayList<String> a,  ArrayList<String> b){
    ArrayList<String> list = new ArrayList<> ();
    int size = Math.max(a.size(), b.size());
    for (int i = 0; i < size; i++) {
      if (i < a.size()) {
        list.add(a.get(i));
      }
      if (i < b.size()) {
        list.add(b.get(i));
      }
    }
    return list;
  }

  public static void main(String[] args) {
    System.out.println(createRandomArray(10));


    ArrayList<String> listEmptyString = createRandomArray(10);
    System.out.println("before replaceEmpty: " + listEmptyString);
    replaceEmpty(listEmptyString);
    System.out.println("after replaceEmpty: " + listEmptyString);


    ArrayList<String> reverseString = createRandomArray(10);
    System.out.println("before makeReversedList: " + reverseString);
    System.out.println("after makeReversedList: " + makeReversedList(reverseString));


    ArrayList<String> mixStringA = createRandomArray(10);
    System.out.println("original mixStringA: " + mixStringA);
    ArrayList<String> mixStringB = createRandomArray(10);
    System.out.println("original mixStringB: " + mixStringB);

    System.out.println("mixing lists a and b: " + mixLists(mixStringA, mixStringB));

  }
}
