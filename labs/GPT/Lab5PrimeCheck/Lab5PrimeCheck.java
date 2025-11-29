import java.util.Scanner;

public class Lab5PrimeCheck {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter N: ");
    int n = scan.nextInt();

    int count = 0;
    System.out.print("Factors: ");
    for(int i = 1; i <= n; i++) {
      if(n % i == 0) {
        System.out.print(i + " ");
        count++;
      }
    }

    System.out.println("\nTotal Factors: " + count);

    if(count == 2)
      System.out.println("Prime");
    else
      System.out.println("Not Prime");

    scan.close();
  }
}
