public class FiveperLine {
    public static void main(String[] args) {
        int a = 1000;
        int b = 2000;
        for (int i = a; i<=b; i++) {
            System.out.print(i);
            if((i+1) % 5 == 0) {
                System.out.println();
            } else System.out.print(" ");
        }
    }
}
