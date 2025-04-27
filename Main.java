import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        var n = sc.nextInt();
        var dig = 0;

        var temp = n; // Preserve original number if needed later
        while (temp != 0) {
            temp /= 10;
            dig++;
        }

        System.out.println("Number of digits: " + dig);
        sc.close(); // Always good to close Scanner
    }
}
