import java.util.Scanner;
public class Lab3EvenOdd {
  public static void main(String[] args) {
    //System.out.println();
    Scanner scan = new Scanner(System.in);
    System.out.print("what is N: ");
    int n =  scan.nextInt();
    System.out.print("All: ");
    for(int i = 0; i <= n; i++) {
      System.out.print(i + " ");
    }
    System.out.println();

    System.out.print("Even: ");
    for(int i = 1; i <= n; i++) {
      if(i % 2 == 0) {
        System.out.print(i + " ");
      }
    } 
    System.out.println();
    System.out.print("Odd: ");
    for(int i = 1; i <= n; i++) {
      if(i % 2 != 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();



    scan.close();
  }
}