package ovningar;
import java.util.Scanner;

public class Kvadraten {
    public static void main(String[] args) {
        System.out.println("Skriv in ett tal: ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        int square = i * i;
        System.out.println("Kvadraten är: " + square);
}}