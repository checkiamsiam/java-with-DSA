// 1
// 12
// 123
// 1234
// 12345

class HelloWorld {
    public static void main(String[] args) {
        int m = 5;
        for(int i = 1; i <= m ; i++){
           for(int j = 1; j <= i; j++){
             System.out.print(j);
           }
           System.out.println();
       }
    }
}


// inverted 

// 12345
// 1234
// 123
// 12
// 1

class HelloWorld {
    public static void main(String[] args) {
        int m = 5;
        for(int i = m ; i >= 1 ; i--){
           for(int j = 1; j <= i; j++){
             System.out.print(j);
           }
           System.out.println();
       }
    }
}