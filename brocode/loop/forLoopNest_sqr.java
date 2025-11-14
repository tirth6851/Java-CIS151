import java.util.Scanner;

public class forLoopNest_sqr {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //scan.nextLine();
    //System.out.println("test");

    System.out.print("Number of columns: ");
    int col = scan.nextInt();
    System.out.print("Number of rows: ");
    int row = scan.nextInt();
    System.out.println();

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
    scan.close();
  }  
}