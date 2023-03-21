// set bit means to set 1 in a bit at a particular position
// for example if we have a number 3 (0011) and we want to set the value of bit at position 3
public class Main {
  public static void main(String[] args) {
    int num = 3; // 0011
    int positionToGet = 3;
    int bitMask = 1<<positionToGet; // 1000
    int result = bitMask | num ; // 1011
    System.out.println(result);
  }
}

// to set something you have to take two steps 
// 1 - bitmask of the position (1<<position)
// 2 - bismask | num