import java.util.*;

public class Permutations {

    public static void generatePermutation(int arr[], int n, int index) {

        if(index == n-1) {
            for(int num:arr) {
                System.out.print(num);
            }
            System.out.println();
            return;
        }

        for(int i=index; i<n; i++) {

            int num = arr[i];
            arr[i] = arr[index];
            arr[index] = num;

            generatePermutation(arr, n, index+1);

            num = arr[i];
            arr[i] = arr[index];
            arr[index] = num;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3};
        int n = arr.length;

        generatePermutation(arr, n, 0);
    }
}