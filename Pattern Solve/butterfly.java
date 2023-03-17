import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        int runtime = m * 2 ;
        //upper half
        for(int i = 1 ; i <= m ; i++){
        	for(int j = 1; j <= runtime; j++){
            	if(j <= i || j > (runtime - i)){
                System.out.print("*"); 
                }else{
                System.out.print(" "); 
                }
            	             
            }
            System.out.println(); 
         }
         //lower half
        for(int i = m ; i >= 1 ; i--){
        	for(int j = 1; j <= runtime; j++){
            	if(j <= i || j > (runtime - i)){
                System.out.print("*"); 
                }else{
                System.out.print(" "); 
                }
            	             
            }
            System.out.println(); 
         }
         
    }
}

// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *