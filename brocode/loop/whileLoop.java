import java.util.Scanner;
public class whileLoop {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    System.out.println(num);
    while (num > 10) {
      System.out.println(num);
      num -= 5;
    }

  } 
}
