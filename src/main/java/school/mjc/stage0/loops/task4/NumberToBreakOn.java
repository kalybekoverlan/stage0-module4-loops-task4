package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if(toBreakWith > numberToGoUntil ) {
            System.out.print("iterating till the end");
        } else {
            for (int i = 0; i < numberToGoUntil; i++) {
                int x = i + 1;
                System.out.println(x);
                if( x == toBreakWith )
                    break;
            }
        }
    }
}
