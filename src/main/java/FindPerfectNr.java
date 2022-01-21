import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class manage finding perfect numbers.
 */
public class FindPerfectNr {

    /**
     * Verifies if the input number is perfect.
     * @param input the number to be verified.
     * @return True if the number is perfect.
     */
    protected boolean isPerfect (int input) {
        int mySum = 0;
        // return the sum of inputNr factors.
        for(int i = 1; i <= input/2; i++) {
            if (input % i == 0) {
                mySum += i;
            }
        }
        return input == mySum ? Boolean.TRUE : Boolean.FALSE;
    }

    /**
     * Lists perfect numbers in range of two integers
     * @param inputRang the input array.
     * @return list of perfect numbers.
     */
    protected List<Integer> perfectNumbers(int[] inputRang) {
        List<Integer> result = new ArrayList<>();
        int min = Arrays.stream(inputRang).min().getAsInt();
        int max = Arrays.stream(inputRang).max().getAsInt();

        for (int i = min; i <= max; i++) {
            if(isPerfect(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
