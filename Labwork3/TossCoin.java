public class TossCoin {
    public static void main(String[] args) {
        int roll = 1;
        int count = 0;
        int head_tail = 0;
        while (true) {
            roll = (int) (Math.random()*1.5);
        
            if(roll == 0) {
                count ++;
                head_tail ++; // if H head_tail +1
                
            }
            else if (roll == 1) {
                count ++;
                head_tail --; //if T head_tail -1
            }
            if (head_tail < 0) {
                head_tail = 0;
            }
            if (head_tail == 2) { // HH when head_tail = 2, which means 2 consecutive heads
                break;
            }
        }
        System.out.println("Number of tosses for 2 heads: " + count);
    }
}              
