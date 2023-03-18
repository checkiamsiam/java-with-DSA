public class Main {
  public static void main(String[] args) {
    // define a array
    String name = "Siam"; // String name = new String("Siam")
    // length function
    int size = name.length();
    // looping in string by charAt
    for(int i = 0 ; i < size ; i++){
    	System.out.println(name.charAt(i));
    }
    // index of 
    int index = name.indexOf("m");
    System.out.println(index);
    // compare between two strings 
    if(name.compareTo("Siam") == 0){
    	System.out.println("yes this is me");
    }else if(name.compareTo("Siam") > 0){
    	System.out.println("not me, his name alphabet index is \'less than\' me");
    }else{
    	System.out.println("not me, his name alphabet index is grater than me");
    }
    
    // slicing a string.substring(beg index , end index + 1 -- by defalut its string.length())
    System.out.println(name.substring(0 , 2));
  }
}

// in java you can't define string by single quote , single quote is for char
// also in a string if you want you can add single quote , double quote , or back slash by /' ,  /" ,  //
