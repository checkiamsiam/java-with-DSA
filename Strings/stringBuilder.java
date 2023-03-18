public class Main {
  public static void main(String[] args) {
  // string builder is used for saving time complexity in string operations. it will take only one memory space for a string.
    StringBuilder name = new StringBuilder("Siam Sheikh");
    // set char in any index
    name.setCharAt(0 , 'I');
    // insert string in another string
    name.insert(1 , "bna");
    // remove a slice from the string
    name.delete(0 , 8);
    // add a string at the last of a string
    name.append(" Siam");
    System.out.println(name);
  }
}