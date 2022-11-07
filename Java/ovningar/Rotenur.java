package ovningar;
import java.lang.Math;
import java.util.Scanner;

public class Rotenur {
    public static void main(String[] args) {
        System.out.println("Skriv in ett tal: ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        System.out.println("Roten ur " + i + " är " + Math.sqrt(i));
}}
