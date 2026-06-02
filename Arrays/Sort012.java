import java.util.*;

public class Sort012 {
    public static void sortColorsSort(int[] nums) {
        Arrays.sort(nums);
    }

    public static void sortColorsExtraSpace(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        int i = 0;
        for(int num:nums) {
            if(num == 0) {
                ans[i++] = num;
            }
        }

        for(int num:nums) {
            if(num == 1) {
                ans[i++] = num;
            }
        }

        for(int num:nums) {
            if(num == 2) {
                ans[i++] = num;
            }
        }

        for(int j=0; j<n; j++) {
            nums[j] = ans[j];
        }
    }
    public static void sortColorsInPlaceWithoutSort(int[] nums) {
        int n = nums.length;
        int z = 0;
        int t = n-1;

        int i=0;
        while(i <= t) {

            if(nums[i] == 0) {
                int num = nums[i];
                nums[i] = nums[z];
                nums[z] = num;
                i++;
                z++;
            } else if(nums[i] == 2) {
                int num = nums[i];
                nums[i] = nums[t];
                nums[t] = num;
                t--;
            } else {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 0, 1};
        sortColorsInPlaceWithoutSort(arr);
        for(int num:arr) {
            System.out.print(num + ", ");
        }
        System.out.println();

        int arr1[] = {2, 0, 1, 2, 1, 0, 2};
        sortColorsExtraSpace(arr1);
        for(int num:arr1) {
            System.out.print(num + ", ");
        }
        System.out.println();

        int arr2[] = {2, 0, 1, 1, 1 , 0, 0, 0, 2, 0};
        sortColorsSort(arr2);
        for(int num:arr2) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}