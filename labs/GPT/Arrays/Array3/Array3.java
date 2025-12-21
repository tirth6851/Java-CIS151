public class Array3 {
  public static void main(String[] args) {

      // TODO 1: Create an int array of size 5
      int[] array = new int[5];
      // TODO 2: Fill the array with values: 5, 10, 15, 20, 25
      // Use a loop
      for(int i = 0; i < array.length; i++) {
        array[i] = (i+1) * 5;
        //System.out.println(array[i]);
      }
      // TODO 3: Create an int variable named sum and set it to 0
        int sum = 0;
      // TODO 4: Use a loop to add all values to sum
        for(int i = 0; i < array.length; i++) {
          sum += array[i];
        }
      // TODO 5: Calculate the average
      // Hint: average = sum / array length
      int ave = sum / array.length;

      // TODO 6: Print sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + ave);

    }
}
