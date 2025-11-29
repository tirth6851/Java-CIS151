import java.util.Scanner;

public class Lab6 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter N: ");
    int n = scan.nextInt();

    int sum = 0;

    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= n; j++){
        int product = i * j;
        System.out.println(i + " x " + j + " = " + product);
        sum += product;
      }
    }

    System.out.println("Sum: " + sum);
    if(sum % 2 == 0)
      System.out.println("EVEN");
    else
      System.out.println("ODD");

    scan.close();
  }
}
