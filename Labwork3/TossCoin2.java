public class TossCoin2 {
    public static void main(String[] args) {
        int roll = 1;
        int count = 0;
        double head_tail = 1.0;
        while (true) {
            roll = (int) (Math.random()*1.5);
        
            if(roll == 0) {
        
                count ++;
                head_tail ++; //if H head_tail + 1
                
            }
            else if (roll == 1) {
            
                count ++;
                head_tail -= 0.5; // if T head_tail - 0.5
            }
            if (head_tail < 1) {
                head_tail = 1;
            }
            if ( head_tail >1 &&((double) (head_tail - Math.floor(head_tail))) == 0.5 ) { //HT will appear if head_tail >1 and have 0.5 
                break;
            }
        }
        System.out.println("Number of tosses for head tail: " + count);
    }
}              
