import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                result[0] = map.get(target - arr[i]);
                result[1] = i;
                return result;
            }
            map.put(arr[i], i);

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = twoSum(arr, target);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

}
