public class Main {
  static StringBuilder reverseStr(String strInput){
  StringBuilder str = new StringBuilder(strInput);
  int size = str.length();
  int halfSize = size / 2 ;
  for(int i = 0; i < halfSize; i++){
  int frontIndex = i; 
  int backIndex = size - 1 - i ;
  char front = str.charAt(frontIndex);
  char back = str.charAt(backIndex);
  str.setCharAt(frontIndex , back);
  str.setCharAt(backIndex , front);  
  }
  
  return str;
  }
  public static void main(String[] args) {
  	String name = "siam";
    System.out.println(reverseStr(name));
  }
}