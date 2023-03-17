import java.util.* ;

// *
// **
// ***
// ****
class HelloWorld {
    public static void main(String[] args) {
       int m = 4;
       for(int i = 1; i <= m ; i++){
           for(int j = 1; j <= i; j++){
               System.out.print("*");
           }
           System.out.println();
        }
   }
}


// inverted 

// ****
// ***
// **
// *

class HelloWorld {
    public static void main(String[] args) {
       int m = 4;
       for(int i = m; i >= 1 ; i--){
           for(int j = 1; j <= i; j++){
               System.out.print("*");
           }
           System.out.println();
    }
   }
}