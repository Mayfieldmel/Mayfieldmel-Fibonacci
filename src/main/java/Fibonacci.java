import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    /**
     * Return the nth number of fibonacci sequence.
     * The fibonacci sequence is calculated by adding the previous two numbers in the sequence to obtain the next
     * number. The first two numbers in the whole fibonacci sequence are always 0 and 1.
     * For instance, the sequence starts as:
     * 0 1 1 2 3 5 8 13 21
     * where the 4th number of the sequence would be 3, the 5th number would be 5, the 6th number would be 8, etc.
     *
     * You could either use a for loop to keep track of the current number of the fibonacci sequence as well as the two
     * numbers before it, or you could look up a recursive solution to experiment with recursion for the first time.
     *
     * @param n an iteration of the fibonacci sequence.
     * @return the nth number of fibonacci sequence.
     */
    public int fib(int n){
        List<Integer> fiboSequence = new ArrayList<>();
        int fiboNumber = 0;
        for (int i = 0; i < n + 1; i++) {
            if (i == 0) {
                fiboNumber = 0;
                fiboSequence.add(fiboNumber);
            } else if (i == 1) {
                fiboNumber = 1;
                fiboSequence.add(fiboNumber);
            } else {
                fiboNumber = fiboSequence.get(i-1) + fiboSequence.get(i-2);
                fiboSequence.add(fiboNumber);
            }
        }
        return fiboNumber;
    }
}
