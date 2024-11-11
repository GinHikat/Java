public class SumOfSines {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double sinx = (double) (Math.sin(2*x));
        double siny = (double) (Math.sin(2*y));
        System.out.println(sinx + siny);

    } 
    
}
