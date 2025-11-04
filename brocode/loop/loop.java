import java.util.Scanner;
public class loop {
  public static void  main(String[] args) {

    //defining scanner
    Scanner sc = new Scanner(System.in);
    System.out.println("HI");
    String whileOrFor= sc.nextLine();
    if (whileOrFor.equals("while") || whileOrFor.equals("While")) {
      int target = 500;
      while (target > 0) {
        System.out.println(target);
        target -= 5;
      }
    }

    else if (whileOrFor.equals("for") || whileOrFor.equals("For")) {
      for (int i = 500; i > 0; i-=5) {
        System.out.println(i);
      }
    }
  }
}
