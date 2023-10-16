import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Välkommen till frågesport!");
        Scanner tb = new Scanner(System.in);

        int points = 0;

        System.out.println("Vad är 1+4?");
        int svar = tb.nextInt();
        if (svar==5){
            System.out.println("Rätt! Du har fått 1 poäng");
            points+=1;
        }
        else{
            System.out.println("Fel");
        }

        System.out.println("Vad är 10^2?");
        int svar1 = tb.nextInt();
        if (svar1==100){
            System.out.println("Rätt! Du har fått 1 poäng");
            points+=1;
        }
        else{
            System.out.println("Fel");
        }

        System.out.println("Vad är 67-13?");
        int svar2 = tb.nextInt();
        if (svar2==54){
            System.out.println("Rätt! Du har fått 1 poäng");
            points+=1;
        }
        else{
            System.out.println("Fel");
        }

        System.out.println("Vad är 11*9?");
        int svar3 = tb.nextInt();
        if (svar3==99){
            System.out.println("Rätt! Du har fått 1 poäng");
            points+=1;
        }
        else{
            System.out.println("Fel");
        }

        System.out.println("Vad är 80/40?");
        int svar4 = tb.nextInt();
        if (svar4==2){
            System.out.println("Rätt! Du har fått 1 poäng");
            points+=1;
        }
        else{
            System.out.println("Fel");
        }

        System.out.println("Du fick "+points+" av 5 poäng");
    }
}
