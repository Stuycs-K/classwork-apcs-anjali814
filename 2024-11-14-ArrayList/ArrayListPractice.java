import java.util.ArrayList;

public class ArrayListPractice{
  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> list = new ArrayList<> ();

    for (int i = 0; i < size; i++){
    int num = (Math.random() * 11.0);
    if (num == 0){
      list.add("");
    } else {
      list.add("" + num);
    }
  }
  return list;
  }

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".

  for (int i = 0; i < original.size(); i++){
    if (original.get(i).equals ("")) {
      original.set(i, "Empty");
    }
  }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> list = new ArrayList<> ();

    for (int i = original.size()-1; i >= 0; i--) {
      list.add(original.get(i));
    }

    return list;

  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //If one list is longer than the other, just attach the remaining values to the end.

    ArrayList<String> list = new ArrayList<> ();
    int size;

    if (a.size() > b.size()) {
      size = a.size();
    }
    else {
      size = b.size();
    }

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
  }
}
