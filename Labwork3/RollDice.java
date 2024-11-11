

public class RollDice {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int count_a = 0;
        int count_b = 0;
        int count_c = 0;
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        for (int i = 0; i<= 10; i++) {
            int roll = (int) ((Math.random()*6) +1);
            if (roll == a) count_a ++;
            else if (roll == b) count_b ++;
            else if (roll == c) count_c ++;
        }
        System.err.println("Count a: " + count_a );
        System.err.println("Count b: " + count_b);
        System.err.println("Count c: " + count_c );

    }
}