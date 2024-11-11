public class HarmonySeries {
    public static void main(String[] args) {
        int sum = 0;
        int n = 10;
        for (int i = 0; i<=n; i++) {
            sum += (double)( 1/n);
        }
        System.out.println(sum);
    }
}
