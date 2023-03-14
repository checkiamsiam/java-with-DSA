import java.util.* ;

class ArrayBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // size define of a array
        int[] arr = new int[size];
        //familiar proccess 
        int[] arr2 = {1 , 3, 5};
        
        // shortcut loop for an array
        for(int ele : arr2){
            System.out.println(ele);
        }
    }
}