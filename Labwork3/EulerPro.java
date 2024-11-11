public class EulerPro 
{
    public static void main(String[] args) 
    {
        int n =Integer.parseInt(args[0]);
    
        final long[] fifthPowers = new long[n + 1];
        for (int i = 0; i <= n; i++) 
        {
            fifthPowers[i] = (long) Math.pow(i, 5);
        }

        for (int e = 1; e <= n; e++) 
        {
            long targetSum = fifthPowers[e];

            // Optimize upper bounds using the fact that each number must be smaller than e
            for (int a = 1; a < e && 4 * fifthPowers[a] <= targetSum; a++) 
            {
                long sum1 = fifthPowers[a];

                for (int b = a; b < e && sum1 + 3 * fifthPowers[b] <= targetSum; b++) 
                {
                    long sum2 = sum1 + fifthPowers[b];

                    for (int c = b; c < e && sum2 + 2 * fifthPowers[c] <= targetSum; c++) 
                    {
                        long sum3 = sum2 + fifthPowers[c];

                        // Calculate required d value directly
                        int d = findD(fifthPowers, targetSum - sum3, c, e);
                        if (d != -1) {
                            System.out.println(a + "^5 + " + b + "^5 + " + c + "^5 + " + d + "^5 = " + e + "^5");
                        }
                    }
                }
            }
        }
    }

    // Binary search to find d value
    private static int findD(long[] fifthPowers, long target, int minD, int maxD) 
    {
        if (target < 0) return - 1;
        
        int left = minD;
        int right = maxD;
        
        while (left <= right) 
        {
            int mid = (left + right) >>> 1; // Shift binary (equivalent to divide by 2 but faster)
            long value = fifthPowers[mid];
            
            if (value == target) 
            {
                return mid;
            } 
            else if (value < target) 
            {
                left = mid + 1;
            } 
            else 
            {
                right = mid - 1;
            }
        }
        return -1;
    }
}