import java.util.Scanner;
public class loopBasics1 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("how many numbers to print: ");
    //System.out.println();
    int num = scan.nextInt();
    num += 1;
    int sum = 0;
    for(int i = 1; i < num; i++) {
      System.out.print(i + " ");
      sum = sum + i;
      
    }

    

    System.out.println();
    System.out.println("Sum: " + sum);
    scan.close();
  }
}
