public class NumComp {
    /**
    * Given a positive int, output its complement number. The complement strategy is to
    * flip the bits of its binary representation.
    */
    public int findComp(int num) {
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        num = ~num; // perform a bitwise complement of num
        return num & mask; // perform an AND bitwise operation on num and mask and return
    }
}