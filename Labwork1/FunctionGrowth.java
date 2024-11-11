public class FunctionGrowth {
    public static void main(String[] args) {
        System.out.println("ln n\\tn\\tn ln n\\tn^2\\tn^3\\t2^n");
        for (int i = 16; i<2048; i*= 2) {
            System.out.println(Math.log(i) +"\\t" +i+"\\t" + i*Math.log(i)+"\\t"+i*i+ "\\t" + i*i*i+ "\\t" + Math.pow(2, i));
        }
    }
}
