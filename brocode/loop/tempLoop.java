import java.util.Scanner;

public class tempLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height = sc.nextInt();
    for (int i = height; i >= height; i--) {
      for (int j = 1; j <= i; j--) {
        System.out.print("*");  // print on the same line
      }
      System.out.println();  // move to next line after each row
    }
    sc.close();
  }
}
