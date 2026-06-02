import java.util.*;

public class KadanesAlgorithm {

    public static int maxSubArrayKadanesAlgorithm(int[] nums) {

        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        int currSum = 0;

        for(int i=0; i<n; i++) {
            currSum += nums[i];
            maxi = Math.max(maxi, currSum);
            if(currSum < 0) {
                currSum = 0;
            }
        }

        return maxi;
    }

    public static int maxSubArrayBruteForce(int[] nums) {

        int maxi = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int j=i; j<n; j++) {
                sum += nums[j];
                maxi = Math.max(sum, maxi);
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArrayKadanesAlgorithm(arr));
        System.out.println(maxSubArrayBruteForce(arr));
    }
}