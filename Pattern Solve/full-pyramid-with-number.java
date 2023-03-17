//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 

class HelloWorld {
    public static void main(String[] args) {
        int m = 5;
        //upper half
        for(int i = 1 ; i <= m ; i++){
        	//print spaces
        	for(int j = 1; j <= (m-i); j++){
                System.out.print(" ");             	             
            }
            // print starts
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");             	             
            }
            System.out.println(); 
         }
         
    }
}