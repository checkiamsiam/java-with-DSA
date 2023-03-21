// update bit means to set 1 in a bit at a particular position if the bit is 0 else set 0 
// for example if we have a number 11 (1011) and we want to update the value of bit at position 3
public class Main {
  public static void main(String[] args) {
    int num = 11; // 1011
    int positionToGet = 3;
    int bitMask = 1<<positionToGet; // 1000
    int result = bitMask ^ num ; // 0011
    System.out.println(result);
  }
}

// also you can do it by combining set and clear bit logic if the existing bit is 0 then set it to 1 else clear it
