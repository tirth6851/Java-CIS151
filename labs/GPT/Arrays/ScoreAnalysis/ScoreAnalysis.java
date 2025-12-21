public class ScoreAnalysis {
    public static void main(String[] args) {
        // TODO 1: Create an int array named scores of size 5
        int[] scores = new int[5];
        // TODO 2: Fill the array with these values using a loop:
        // 12, 8, 15, 4, 20
        scores = new int[]{12, 8, 15, 4, 20};
        // TODO 3: Create int variables:
        // totalScore (start at 0)
        // goodScores (start at 0)
        int totalScore = 0;
        int goodScores = 0;
        // TODO 4: Loop through the array
        // - Add each value to totalScore
        // - If value >= 10, increase goodScores
        for(int i = 0; i < scores.length; i++) {
          totalScore += scores[i];
          if(scores[i] >= 10) {
            goodScores++;
          }
        }
        
        // TODO 5: Print exactly:
        // Total Score: 59
        // Good Scores: 3
        System.err.println("Total Score: " + totalScore);
        System.err.println("Good Scores: " + goodScores);
    }
}
