import java.util.Scanner;
public class loop {
  public static void  main(String[] args) {

    //defining scanner
    Scanner sc = new Scanner(System.in); 
    System.out.println("HI"); // testing line
    String whileOrFor= sc.nextLine(); //geting input to know which one to run (while or for loop)

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
    
    else if (whileOrFor.equals("neestForLoop")) {
      System.out.println("What type of neestLoop ?");
      String whatType = sc.nextLine();
      System.out.println(whatType); 
      if (whatType.equals("square")) {
        System.out.print("How many rows ? ");
        int row = sc.nextInt();
        System.out.print("How many colons ? ");
        int col = sc.nextInt();
        for (int i = 0; i < 5; i++) {
          for (int j = 0; j < 5; j++) {
            System.out.print("*");
          }
          System.out.println();
        }
      }
    }
    else {
      System.out.println("Invalid Input");
    }
  }
}
