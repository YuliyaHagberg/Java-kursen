package ovningar;
import java.util.Scanner;

public class Omvandlaren {
    public static void main(String[] args) {
        double euro = 0.092;
        System.out.println("Ange ny dagskurs?");
        Scanner input = new Scanner(System.in);
        boolean ans = input.nextBoolean();
            if (ans == true) {
                System.out.println("Mata in aktuell kurs.");
                String aktuell = input.next();}
        System.out.println("Pris i SEK:");
        double pris = input.nextDouble();
        System.out.println("Pris i EUR är " + euro * pris);      
}}