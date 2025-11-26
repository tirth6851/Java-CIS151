import java.util.Scanner;
public class Lab2Pattern {
  public static void main(String[] args){
    //System.out.println();
    Scanner scan = new Scanner(System.in);
    int height = scan.nextInt();
    height += 1;

    for (int i = 0; i< height; i++) {
      System.out.println();
      for(int j = 0; j < i; j++) {
        System.out.print("*");
      }
    }
    System.out.println();

  }
}
