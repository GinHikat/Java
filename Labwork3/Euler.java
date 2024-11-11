public class Euler{
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        for (long e = 1; e<= n; e++){
            long e5 = e*e*e*e*e;
            for(long a = 1; a*a*a*a*a <= e5; a++) {
                long a5 = a*a*a*a*a;
                for (long b = a; b*b*b*b*b <= e5-a5; b++) {
                    long b5 = b*b*b*b*b;
                    for (long c = b; c*c*c*c*c <= e5-a5-b5; c++){
                        long c5 = c*c*c*c*c;
                        for (long d = c; d*d*d*d*d <= e5-a5-b5-c5; d++){
                            long d5 = d*d*d*d*d;
                            if (a5 + b5 + c5 + d5 == e5 ) {
                                System.out.println(a + "^5 + " + b + "^5 + " + c + "^5 + " + d + "^5 = " + e + "^5");
                            }
                        }
                    }
                }
            }
        }
    }
}