public class CubeSum{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int a = 0; a*a*a<n; a++) {
            for (int b = a; a*a*a + b*b*b<n; b++) {
                for (int c = a+1; c*c*c<n; c++) {
                    for (int d = c; d*d*d<n; d++) {
                        if (c*c*c + d*d*d == a*a*a + b*b*b) {
                                System.err.println(a+"^3 + " + b + "^3 = " + c+ "^3 + " + d + "^3");
                            }
                    }
                }
            }
        }
    }
}