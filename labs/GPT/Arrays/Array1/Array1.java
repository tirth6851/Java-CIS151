public class Array1 {

    public static void main(String[] args) {

        // TODO 1: Declare an integer array named nums with 5 values
        int[] nums = {50, 60, 70, 80, 90};

        // TODO 2: Print the first element of the array
        System.out.println(nums[0]);

        // TODO 3: Print the last element of the array
        // Hint: use nums.length
        System.out.println(nums[nums.length-1]);


        // TODO 4: Use a for loop to print all elements in the array
        // Hint: loop from 0 to nums.length - 1
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }        

    }
}
