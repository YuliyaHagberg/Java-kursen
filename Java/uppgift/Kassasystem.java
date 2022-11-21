package uppgift;
import java.util.Scanner;

public class Kassasystem {
    public static void main(String[] args) {
        System.out.println("Skriv in kostnad: ");
        Scanner input = new Scanner(System.in);
        int kostnad = input.nextInt();

        System.out.println("Skriv in summa: ");
        int summa = input.nextInt();
        int tillbaka = summa - kostnad;

        int _1000 = tillbaka / 1000;
        int _500 = (tillbaka-1000*_1000)/500;
        int _200 = (tillbaka-(1000*_1000+500*_500)) / 200;
        int _100 = (tillbaka-(1000*_1000+500*_500+200*_200)) / 100;
        int _50 = (tillbaka-(1000*_1000+500*_500+200*_200+100*_100)) / 50;
        int _20 = (tillbaka-(1000*_1000+500*_500+200*_200+100*_100)) / 20;
        int _2 = (tillbaka-(1000*_1000+500*_500+200*_200+100*_100+20*_20)) / 2;
        int _1 = (tillbaka-(1000*_1000+500*_500+200*_200+100*_100+20*_20+2*_2));
            
        System.out.println("Kunden får tillbaka: "+_1000+": 1000-lappar, "+_500+": 500-lappar, "+_200+
        ": 200-lappar, "+_100+": 100-lappar, "+_50+": 50-lappar, "+_20+": 20-lappar, "+_2 +": 2-lappar, "+_1+": 1-lappar.");
    }}

    //Anta att summan är större eller lika med kostnaden, en negativ växel visar att det saknas
    //int kostnad = 1600;
    //int[] kundensInput = {1, 1, 0, 2, 0, 1, 1, 0};
    //int[] pengaEnheter = {1000, 500, 200, 100, 50, 20, 2, 1};
    //int[] vaxel = {0, 0, 0, 0, 0, 0, 0, 0};
    //int total = 0;
    //for (int i = 0; i < length(pengaEnheter); i++){
    //  total += kundensInput[i]*pengaEnheter[i]};
    //int skillnad = total - kostnad;
    //int j = 0;
    //while (skillnad > 0){ 
    //  vaxel[j] = total%pengaEnheter[j]
    //  skillnad += -(total%pengaEnheter[j])*pengaEnheter[j]
    //  j += 1};