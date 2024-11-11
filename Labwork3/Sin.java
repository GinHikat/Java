public class Sin {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        System.err.println("Normal way: " + Math.sin(n));
        n = n % (2*Math.PI);
        double term = 1.0;
        double sum = 0.0;
        for (int i = 1; term != 0.0; i++) {
            term *= (n / i);
            if (i % 4 == 1) {
                sum += term;
            }
            else if (i % 4 == 3){

            sum -= term;
            }
        }
        System.err.println("Taylor way: " + sum);


    }
}