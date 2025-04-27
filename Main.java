import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dig=0;
        int n;
        System.out.println("Enter a number:");
        n= sc.nextInt();
        while (n !=0)
        {
            n= n/10;
            dig++;
        }
        System.out.println(dig);
    }
}