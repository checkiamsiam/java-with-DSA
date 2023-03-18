public class Main {
  static String reverseStr(String strInput){
  int strSize = strInput.length();
  char[] strArray = new char[strSize];
  
  for(int i = 0 ; i < strSize; i++){
  char charEle = strInput.charAt(i);
  strArray[i] = charEle;
  }
  
  String strOutput = "" ;
  
  for(int i = 0 ; i < strSize ; i++){
  strOutput = strOutput + strArray[strSize - 1 - i];
  }
  
  return strOutput;
  }
  public static void main(String[] args) {
  	String name = "siam";
    System.out.println(reverseStr(name));
  }
}