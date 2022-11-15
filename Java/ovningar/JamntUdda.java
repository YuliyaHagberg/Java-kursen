package ovningar;
import java.util.Scanner;

public class JamntUdda {
    public static void main(String[] args) {
        System.out.println("Skriv in ett tal: ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if (i % 2 == 0) {
            System.out.println(i + " är ett jämnt tal!");
        } else {
        System.out.println(i + " är ett udda tal!");
    }}}