//Given an integer, write a function to determine if it is a power of two.
public class Power_of_Two {
    /*
     * @param n: An integer
     * @return: True or false
     */
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

}
