public class NumComp {
    /**
    * Given a positive int, output its complement number. The complement strategy is to
    * flip the bits of its binary representation.
    */
    public int findComp(int num) {
        // returns the left most highest one bit and subtract 1 to change the lowest bits
        int mask = (Integer.highestOneBit(num)) - 1; 
        // tilde(~) performs a bitwise complement of num
        num = ~num; 
        // perform an AND bitwise operation on num and mask and return
        return num & mask; 
    }
}