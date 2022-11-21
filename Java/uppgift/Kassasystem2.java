package uppgift;
import java.util.Arrays;
import java.util.Scanner;

public class Kassasystem2 {
    public static void main(String[] args) {
        System.out.println("Skriv in kostnad: ");
        Scanner input = new Scanner(System.in); //läser in kostnaden för kundens köp
        int kostnad = input.nextInt();
        //anta att: kundensTotal >= kostnad; en negativ växel visar att det saknas pengar från kunden

        int[] valor = {1000, 500, 200, 100, 50, 20, 2, 1};  //array med vilka valörer som finns, består av 8 positioner
        int[] kundensInput = new int[valor.length]; //en ny array med 8 positioner skapas, ska lagra kundens input
        //i=nummer på position i en array
        //i är 0 och efter varje inputat värde så adderas 1 till i (så det blir nummer på nästa position)
        //så länge i är mindre än längden av valor-array
        for (int i=0; i<valor.length; i++){  
            //läser in array värden
            System.out.println("Skriv in antal " + valor[i] + "-lappar."); 
            kundensInput[i] = input.nextInt();}

        int[] vaxel = {0, 0, 0, 0, 0, 0, 0, 0}; //tom array för växel med 8 positioner
        int kundensTotal = 0; //definierar en variabel som kommer spara summan av alla valörer som kunden gav till oss
        for (int i = 0; i < valor.length; i++){ //samma sak som rad 17
            kundensTotal += kundensInput[i]*valor[i];} //a+=b betyder a=a+b 
            //värdet som är sparat på en position i kundensInput-array * värdet på samma position i valor-array
        int skillnad = kundensTotal - kostnad; //summan som kunden ska få tillbaka
        int j = 0; //j fungerar på samma sätt som i, alltså nummer på position i en array
        while (skillnad > 0){ //så länge skillnad > 0...
            vaxel[j] = skillnad/valor[j]; //så kommer en viss position i vaxel-array att anta heltalsdivisionen utan rest
            if (vaxel[j] != 0){ //om en position i vaxel-arrays = 0, så kommer den inte att skrivas ut
                System.out.println("Kunden ska få " + vaxel[j] + " stycken " + valor[j] + "-lappar.");}
            skillnad -= vaxel[j]*valor[j]; //a-=b betyder a=a-b;
            j++;}
        //System.out.println(Arrays.toString(vaxel));
}}