import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        // Case 1: The three largest elements are all positive
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Case 2: The two smallest elements (negative numbers) and the largest element (positive number)
        int product2 = nums[0] * nums[1] * nums[n - 1];

        // Return the maximum of the two products
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int maxProduct = maximumProduct(nums);
        System.out.println("Maximum Product: " + maxProduct);
    }
}
