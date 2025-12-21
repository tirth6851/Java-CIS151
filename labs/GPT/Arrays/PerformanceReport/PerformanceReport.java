public class PerformanceReport {
    public static void main(String[] args) {
        // TODO 1: Create an int array with these values:
        // 95, 42, 67, 88, 51, 30, 76
        int[] array = {95, 42, 67, 88, 51, 30, 76};
        // TODO 2: Create variables:
        // total (int, start at 0)
        // excellentCount (int)
        // satisfactoryCount (int)
        // needsImprovementCount (int)
        int total = 0;
        int excellentCount = 0;
        int satisfactoryCount = 0;
        int needsImprovementCount = 0;
        // TODO 3: Loop through the array
        // - Add score to total
        // - Classify each score and update the correct counter
        for(int i = 0; i < array.length; i++){
          total += array[i];
          if(array[i] >= 80) {
            excellentCount++;
          }
          else if( array[i] >= 50 && array[i] <= 79) {
            satisfactoryCount++;
          }
          else {
            needsImprovementCount++;
          }
        }

        // TODO 4: Calculate average (integer average is fine)
        int average = total / array.length;
        // TODO 5: Print EXACTLY this format:
        // Total: 449
        // Average: 64
        // Excellent: 2
        // Satisfactory: 3
        // Needs Improvement: 2


        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Excellent: " + excellentCount);
        System.out.println("satisfactory: " + satisfactoryCount);
        System.out.println("needs improvement: " + needsImprovementCount);

        

    }
}

