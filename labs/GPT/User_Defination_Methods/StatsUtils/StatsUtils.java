public class StatsUtils {

    public static void main(String[] args) {
        int[] data = {12, 8, 15, 4, 20};
        printReport(data);
    }

    public static int sum(int[] data) {
      // TODO
      int sum = 0;
      for (int i = 0; i < data.length; i++) {
        sum += data[i];
      }
      return sum;
    }

    public static double average(int[] data) {
      // TODO
      if (data.length == 0) {
        return 0.0;
      }
      return (double) sum(data) / data.length;
    }

    public static void printReport(int[] data) {
      // TODO
    }
}
