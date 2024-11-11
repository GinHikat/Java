

public class MonteHall {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        int wins_change = 0;
        int wins_keep = 0;
        for (int i = 0; i<= trials; i++) {
        int prize = (int) (Math.random()*3);
        int choice = (int) (Math.random()*3);
        int reveal;
        do {
            reveal = (int) (Math.random()*3);
        } while (reveal == prize || reveal == choice);
        int change = 3 - choice - reveal; //if change then the change is the other door that's not chosen or revealed
        if (prize == change) wins_change ++;
        if (prize == choice) wins_keep ++;
        }
        System.err.println("Probability of wins by change: " + (double) wins_change/trials );
        System.err.println("Probability of wins by keep: " + (double) wins_keep/trials );
    }
}