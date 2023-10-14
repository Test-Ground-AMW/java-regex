import java.util.Scanner;

public class Demo2RegExp {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your contact number: ");
        String contact = SCANNER.nextLine();
        
        /*contact format: 077-1234567 or +9477-1234567*/
        if(contact.matches("(0\\d{2}-\\d{7})|([+]94\\d{2}-\\d{7})")){
            System.out.println("Valid contact");
        } else {
            System.out.println("Invalid contact");
        }
    }
}
