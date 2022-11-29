import java.util.*;

// Brute Force Approach
public class CountOfSmallerNumbersAfterSelf {
    public static void countNumber(int a[], int n) {
        int count, j, x;
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            count = 0;
            j = i + 1;
            x = a[i];
            while (j < n) {
                if (x > a[j]) {
                    count++;
                }
                j++;
            }
            c[i] = count;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(c[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 8, 5, 2, 3, 6, 1, 2 };
        int n = a.length;
        countNumber(a, n);

    }

}

/*
 * 315. Count of Smaller Numbers After Self
 * Hard
 * 
 * Given an integer array nums, return an integer array counts where counts[i]
 * is the number of smaller elements to the right of nums[i].
 * 
 * Example 1:
 * 
 * Input: nums = [5,2,6,1]
 * Output: [2,1,1,0]
 * Explanation:
 * To the right of 5 there are 2 smaller elements (2 and 1).
 * To the right of 2 there is only 1 smaller element (1).
 * To the right of 6 there is 1 smaller element (1).
 * To the right of 1 there is 0 smaller element.
 * Example 2:
 * 
 * Input: nums = [-1]
 * Output: [0]
 * Example 3:
 * 
 * Input: nums = [-1,-1]
 * Output: [0,0]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 */
