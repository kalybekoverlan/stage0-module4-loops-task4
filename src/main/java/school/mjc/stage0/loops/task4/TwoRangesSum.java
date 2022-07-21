package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skippedSum = 0;
        int countedSum = 0;

        if(numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if(lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            System.out.println("skipped sum is number" + skippedSum + "\ncounted sum is number" + countedSum);
        }
    }
}
