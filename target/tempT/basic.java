import java.util.Scanner;
public class basic {
  public static void main(String[] args) {
    System.out.println ("hello world");  
    Scanner scan = new Scanner(System.in);  // definning scanner



    System.out.print("Whats your age: ");
    int age = scan.nextInt();
    
    System.out.print("Whats your GPA: ");
    float gpa = scan.nextFloat();
    
    scan.nextLine();


    System.out.print("Whats your name: ");
    String name = scan.nextLine(); 
    
    double pi = Math.PI;
    
    System.out.print("What char do you like: ");
    char symbole = scan.next().charAt(0);
    
    System.out.print("Did you fail or pass (Pass = 'true', Fail = 'false'): ");
    boolean failOrPass = scan.nextBoolean();

    //System.out.println(scan.nextLine());

    System.out.println();
    
    System.out.println(age);
    System.out.println(gpa);
    System.out.println(name);
    System.out.println(pi);
    System.out.println(symbole);
    System.out.println(failOrPass);

    if(failOrPass == true) {
      System.out.println();
      //System.out.println("Congaratulations you mother fuker ");
      System.out.println("nice work with the: " + gpa + " GAP " + name);
    }
    else {
      System.out.println("YOU FAILED");
    }


    scan.close();
  }
}
