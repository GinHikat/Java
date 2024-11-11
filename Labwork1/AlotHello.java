public class AlotHello {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i<=n; i++) {
            System.out.print(i);
            if (i % 10 == 1 && i != 11) {
                System.out.printf("st ");
            } else if (i%10 == 2 && i!= 12) {
                System.out.printf("nd ");
            } else if (i%10 ==3 && i!= 13) {
                System.out.printf("rd ");
            } else {
                System.out.printf("th ");
            }
            System.out.println("Hello");

        }
    }
}
