//     1
//    212
//   32123
//  4321234
// 543212345


class HelloWorld {
    public static void main(String[] args) {
        int m = 5;
        //upper half
        for(int i = 1 ; i <= m ; i++){
        	//print spaces
        	for(int j = 1; j <= (m-i); j++){
             System.out.print(" "); 
            }
            // print frist half number
            for(int k = i ; k >= 1; k--){
             System.out.print(k); 
            }
            // print second half number
            for(int l = 2 ; l <= i ; l++){
             System.out.print(l); 
            }
            // exchange line
            System.out.println(); 
         }
         
    }
}

