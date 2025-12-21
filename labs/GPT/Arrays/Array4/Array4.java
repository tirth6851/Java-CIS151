public class Array4 {

    public static void main(String[] args) {

        int[] nums = {12, 45, 7, 89, 23, 18, 60};

        int max = nums[0];
        int min = nums[0];
        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
            }

            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Evens: " + evenCount);
    }
}
