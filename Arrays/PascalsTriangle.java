import java.util.*;

public class PascalsTriangle {
        public static void generateHelper(List<List<Integer>> ans, List<Integer> currList, int n, int i) {

            if(i == 0) {
                currList.add(1);
                ans.add(currList);
                return;
            }

            for(int j=0; j<i+1; j++) {
                if(j == 0) {
                    currList.add(1);
                } else if(j == i) {
                    currList.add(1);
                } else {
                    int sum = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    currList.add(sum);
                }
            }

            ans.add(currList);
        }

        public static List<List<Integer>> generate(int n) {

            List<List<Integer>> ans = new ArrayList<>(n);

            for(int i=0; i<n; i++) {

                List<Integer> currList = new ArrayList<>(i+1);

                generateHelper(ans, currList, n, i);

            }

            return ans;
        }


    public static void main(String[] args) {
        System.out.println(generate(10));
    }
}