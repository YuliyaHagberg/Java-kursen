package ovningar;
import java.util.Scanner;

public class CalculateAmount {
    public static void main(String[] args) {
        float sum=0.0f, sale=0.0f;

        System.out.println("Skriv in köpesumma: ");
        Scanner input = new Scanner(System.in);
        sum = input.nextFloat();
        
        if (sum == 0) {
            System.out.println("OBS: Köpesumman kan inte vara noll!");
        } else {
            if (sum>=1000) {
                System.out.println("Skriv in rabatt: ");
                sale = input.nextFloat();
                sum = (float) (sum*(1-sale));
            }
        System.out.println("Summa att betala " + sum);
    }}}