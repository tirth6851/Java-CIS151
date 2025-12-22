import java.util.Scanner;

public class Lab4Reverse {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("what is N: ");
    int n = scan.nextInt();
    n += 1;
    //int tempN = n * -1;
    int tempN = n;
    int sum = 0;
    System.out.print("Reverse: ");
    for(int i = 2; n >= i; i++) {
      tempN -= 1;
      sum += tempN;
      System.out.print(tempN + " ");
    } 
    System.out.println();
    //System.out.println(n);

    int temp2N = n;
    System.out.print("Multiples of 3: ");
    for(int i = 2; n >= i; i++) {
      temp2N -= 1;
      if (temp2N % 3 == 0) {
        System.out.print(temp2N + " ");
      }
    }
    System.out.println();
    System.out.println("Sum: " + sum);
    scan.close();
  }
}
