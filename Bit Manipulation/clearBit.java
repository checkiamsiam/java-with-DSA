// clear bit means to set 0 in a bit at a particular position
// for example if we have a number 11 (1011) and we want to clear the value of bit at position 3

public class Main {
  public static void main(String[] args) {
    int num = 11; // 1011
    int positionToGet = 3;
    int bitMask = 1<<positionToGet; // 1000
    int bitMaskComplement = ~(bitMask) // 0111
    int result = ~(bitMask) & num ; // 0111
    System.out.println(result);
  }
}

// to clear something you have to take three steps 
// 1 - bitmask of the position (1<<position)
// 2 - 1's complement of bit mask ~(bitmask)
// 2 - 1's complement of bit mask & num