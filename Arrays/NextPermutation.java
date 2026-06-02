import java.util.*;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {

        int n = nums.length;

        int pivot = -1;

        // Step 1: Find pivot
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse whole array
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find next greater element from right
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // Step 4: Reverse suffix
        reverse(nums, pivot + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for(int num:arr) {
            System.out.print(num + ", ");
        }

        System.out.println();
        nextPermutation(arr);

        for(int num:arr) {
            System.out.print(num + ", ");
        }
    }
}