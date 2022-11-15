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