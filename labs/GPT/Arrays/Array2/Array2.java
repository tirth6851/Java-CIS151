public class Array2 {
    public static void main(String[] args) {
        // TODO 1: Create an integer array named nums with size 5
        int[] nums = new int[5];
        // TODO 2: Use a for loop to fill the array
        // Values should be: 10, 20, 30, 40, 50
        // Hint: use (i + 1) * 10
        for(int i = 0; i < nums.length; i++){
            nums[i] = (i + 1) * 10;
            //System.out.println(nums[i]);
        }
        // TODO 3: Create an int variable named sum and set it to 0
        int sum = 0;
        // TODO 4: Use a loop to add all array values to sum
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        // TODO 5: Print the sum
        System.out.println(sum);

    }
}
