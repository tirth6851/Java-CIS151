package brocode.version1;

public class practice {
    public static void main(String[] args) {
        int age = 19;
        String gender = "Male";
        double gpa = 3.68;
        char fullstop = '.';
        char comma = ',';
        char alpha_A = 'A';

        System.out.println(age + " " + gender + " and" + comma + " their gpa is = " + gpa + " OR " + alpha_A + fullstop);

        boolean isStudent = true;
        boolean notStudent = false;

        if (isStudent) {
            System.out.println("Yes, is a student");
        }
        else if (notStudent) {
            System.out.println("get lost");
        }
        else{
            System.out.println("are you ok....");
        }
    }
}
