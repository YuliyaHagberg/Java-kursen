package forelasningar;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        double summa = 0.0;
        System.out.println("Mata in summa: ");
        
        Scanner input = new Scanner(System.in);
        summa = input.nextDouble();
        
        if (summa >= 1000.0) {
            summa = summa * 0.9;
        }

        System.out.println("Summa att betala: " + summa);
    }
}