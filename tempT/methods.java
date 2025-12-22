import java.util.Scanner;

public class methods {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int age = scan.nextInt();
    String name = scan.nextLine();
    greating(age, name);
  }

  static void greating(int age, String name){
    System.out.printf("hi %s you are %d years old\n", name, age);
  }
}
