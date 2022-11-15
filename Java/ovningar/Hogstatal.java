package ovningar;
import java.util.Scanner;
import java.lang.Math;

public class Hogstatal {
    public static void main(String[] args) {
        int tal1, tal2, tal3;
        Scanner input = new Scanner(System.in);
        System.out.println("Ange ett värde för första talet: ");
        tal1 = input.nextInt();
        System.out.println("Ange ett värde för andra talet: ");
        tal2 = input.nextInt();
        System.out.println("Ange ett värde för tredje talet: ");
        tal3 = input.nextInt();
        int max = Math.max(tal1, Math.max(tal2, tal3));
        System.out.println("Produkten blev: " + max);
    }}