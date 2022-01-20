

public class FindPerfectNr {

    protected float input;

    public FindPerfectNr(float input) {
        this.input = input;
    }

    protected void setNumber(float inputNr) {
        input = inputNr;
    }

    protected float getNumber() {
        return input;
    }

    /**
     * Verifies if the input number is perfect.
     * @return True if the number is perfect.
     */
    protected boolean isPerfect () {
        float mySum = 0;
        // return the sum of inputNr factors.
        for(int i = 1; i <= input/2; i++) {
            if (input % i == 0) {
                mySum += i;
            }
        }
        return input == mySum ? Boolean.TRUE : Boolean.FALSE;
    }

    public static void main(String args[]) {
       /* FindPerfectNr findPerfectNr01 = new FindPerfectNr();
        boolean perfectNr = findPerfectNr01.isPerfect(496);

        if (perfectNr)
        System.out.println("the number is perfect.");
        else
            System.out.println("the number is not perfect");*/
    }
}
