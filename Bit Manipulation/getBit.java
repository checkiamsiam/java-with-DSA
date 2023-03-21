// get mean to get the value of a bit at a particular position
// for example if we have a number 3 (0011) and we want to get the value of bit at position 3
public class Main {
  public static void main(String[] args) {
    int num = 3; // 0011
    int positionToGet = 1;
    int bitMask = 1<<positionToGet; // 0010
    int result = bitMask & num ; // 0010
    if(result == 0){
    System.out.println("number is zero");
    }else{
    System.out.println("number is 1");
    }
  }
}

// to get something you have to take two steps 
// 1 - bitmask of the position (1<<position)
// 2 - bismask & num
// if the result of step 2 is non zero that means the number of that position is 1 else 0;
