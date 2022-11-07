package forelasningar;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Mata in tal1: ");
        int tal1 = input.nextInt();

        System.out.println("Mata in tal2: ");
        int tal2 = input.nextInt();

        int sum = tal1 + tal2;

        System.out.println("Summan av tal1 och tal2 är " + sum);
    }
}