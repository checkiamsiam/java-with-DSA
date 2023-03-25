public class Main {
	// print array
	static void printArr(int[] arr){   
    	System.out.print("[");
    	for(int i = 0; i < arr.length ; i++ ){
    	System.out.print(arr[i]);
    	if(i != arr.length - 1){
    		System.out.print( "," + " ");
    		}
    	}
    	System.out.print("]");
    }
		// bubble sort
		static int[] bubbleSort(int[] arr){
			for(int i = 0 ; i < arr.length - 1 ; i++){
				for(int j = 0 ; j < arr.length - 1 - i ; j++){
					if(arr[j] > arr[j + 1]){
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			return arr;
		}
		// selection sort
		static int[] selectionSort(int[] arr){
			for(int i = 0 ; i < arr.length - 1 ; i++){
				int smallest = i ;
                for(int j = i + 1 ; j < arr.length ; j++){
                	if(arr[smallest] > arr[j]){
                    	smallest = j;
                    }
                }
                int temp = arr[i];
				arr[i] = arr[smallest];
				arr[smallest] = temp;
			}
			return arr;
		}
		// insertion sort
		static int[] insertingSort(int[] arr){
			for(int i = 1 ; i < arr.length ; i++){
    	int current = arr[i];
        int j = i - 1 ;
        while(j >= 0 && arr[j] > current ){
        	arr[j+1] = arr[j];
            j--;
        }
        arr[j + 1] = current;
        
    	}
			return arr;
		}
  public static void main(String[] args) {
  	int[] nums = {1, 7 , 2 , 10 , 5 , 9 , 4 , 3 , 6 , 8};
    
    bubbleSort(nums);
    
    printArr(nums);

		insertingSort(nums);
		
		printArr(nums);
  }
}
