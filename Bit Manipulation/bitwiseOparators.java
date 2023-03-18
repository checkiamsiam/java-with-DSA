public class Main {
  public static void main(String[] args) {
    int a = 5 ; // 0101
    int b = 3 ; // 0011

	// bitwise and operator
    System.out.println(a & b); // 0001 = 1 (if two number are 1 than 1 or 0)
    // bitwise or operator
    System.out.println(a | b); // 0111 = 7 (if any one number is 1 than 1 otherwise 0)
    // bitwise xor operator
    System.out.println(a ^ b); // 0110 = 6 (if diffrent value than 1 or if same value than 0)
    // bitwise 1's complement
    System.out.println(~a); // - 0101 = -6 (if negetive than 1's complement is positive and if positive 1's complement is negetive) 
    
    // binary shift operators 
    // << -- left shift , >> -- right shift
    // data-oparator-how left he have to shift(int number)
    // after complete the shift fill 0 in other positions
    
    // left shift operator 
    System.out.println(a>>1); // 0010 = 2
    // right shift operator
     System.out.println(b<<2); //1100 = 12
    
  }
}