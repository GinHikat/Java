public class RollLoadedDice {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i<n; i++){
        double r = Math.random();
        if (r < 1.0/8.0) System.out.println(1);
        else if (r<2.0/8.0) System.out.println(2);
        else if (r<3.0/8.0) System.out.println(3);
        else if (r<4.0/8.0) System.out.println(4);
        else if (r<5.0/8.0) System.out.println(5);
        else if (r<8.0/8.0) System.out.println(6);
        }
    }
}
