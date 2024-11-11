
public class Exp {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        System.err.println("Normal way: " + Math.exp(x));
        double sum = 0.0;
        double term = 1.0;
        boolean isNegative = false;
        if (x<0) {
            x = -x;
            isNegative = true;
        }
        for (int n = 1; sum != sum + term; n++) {
            sum += term;
            term *= x/n;
        }
        if (!isNegative) {
            sum = 1.0/sum;
            System.err.println("Taylor way: " + sum);
        }
       
    }
}