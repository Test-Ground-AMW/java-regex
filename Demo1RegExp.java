import java.util.Scanner;

public class Demo1RegExp {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your nic: ");
        String nic = SCANNER.nextLine();

        if(nic.matches("\\d{9}[Vv]")){
            System.out.println("Valid nic");
        } else {
            System.out.println("Invalid nic");
        }
    }
}
