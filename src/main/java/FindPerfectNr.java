

public class FindPerfectNr {

    public FindPerfectNr() {
    }

    /**
     * Verifies if the input number is perfect.
     * @param inputNr the input number.
     * @return True if the number is perfect.
     */
    public boolean isPerfect (int inputNr) {
        float mySum = 0;
        // return the sum of inputNr factors.
        for(int i = 1; i <= inputNr/2; i++) {
            if (inputNr % i == 0) {
                mySum += i;
            }
        }
        return inputNr == mySum ? Boolean.TRUE : Boolean.FALSE;
    }

    public static void main(String args[]) {
        FindPerfectNr findPerfectNr01 = new FindPerfectNr();
        boolean perfectNr = findPerfectNr01.isPerfect(496);

        if (perfectNr)
        System.out.println("the number is perfect.");
        else
            System.out.println("the number is not perfect");
    }
}
