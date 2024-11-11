public class BoysGirls {
    public static void main(String[] args) {
        int trials;
        int boy = 0;
        int girl = 0;
        
        while(true) {
            int breed = (int) (Math.random()*1.5);
            if (breed == 0) {
                boy ++;
            }
            else if (breed == 1) {
                girl ++;
            }
            if (girl > 0 && boy >0) break;
        }
        System.out.println("Number of boys: " + boy);
        System.out.println("Number of girls: " + girl);

        

    }
}