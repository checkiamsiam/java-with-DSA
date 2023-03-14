import java.util.* ;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowsCount = sc.nextInt();
        int colsCount = sc.nextInt();
        int[][] table = new int[rowsCount][colsCount];
        for(int i = 0 ; i < rowsCount ; i++ ){
            for(int j = 0 ; j < colsCount ; j++ ){
                int random = (int)(Math.random() * 101);
                table[i][j] = random; 
                System.out.println(table[i][j]);
             }
        }
    }
}