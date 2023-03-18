//     *****
//    *****
//   *****
//  *****
// *****


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
            for(int j = 1; j <= m; j++){
                System.out.print("*");             	             
            }
            System.out.println(); 
         }
         
    }
}