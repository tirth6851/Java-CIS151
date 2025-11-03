import java.util.Scanner;
public class loop {
  public static void  main(String[] args) {

    //defining scanner
    Scanner sc = new Scanner(System.in);


    int target = 500;
    while (target > 0) {
      System.out.println(target);
      target -= 5;
    }

  }
}
