// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 


class HelloWorld {
    public static void main(String[] args) {
        int m = 5;
        int printingVar = 1;
        for(int i = 1 ; i <= m ; i++){
           for(int j = 1; j <= i; j++){
             System.out.print(printingVar + " ");
             printingVar ++;
           }
           System.out.println();
       }
    }
}