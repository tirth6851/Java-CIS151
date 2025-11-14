import java.util.Scanner;
public class forLoop {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    /*
    System.out.print("enter a number: ");
    System.out.println();
    for (int i = 50; i >= 0; i--) {
      System.out.println(i);
    }
    */
    // with input
    System.out.print("enter a number: ");
    System.out.println();
    for (int i = scan.nextInt(); i >= 0; i--) {
      System.out.println("*");
    }
    scan.close();
  }

}
