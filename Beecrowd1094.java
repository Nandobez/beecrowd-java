import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1094 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int Coelhos = 0;
        int Ratos = 0;
        int Sapos = 0;

        for(int i = 0; i < N; i++){
            int X = input.nextInt();
            char Y = input.next().charAt(0); // Corrigido para ler um único caractere

            if(Y == 'C'){ // Usar comparação de caracteres
                Coelhos += X;
            }

            if(Y == 'R'){
                Ratos += X;
            }

            if(Y == 'S'){
                Sapos += X;
            }
        }

        System.out.println("Total: " + (Sapos + Ratos + Coelhos) + " cobaias");
        System.out.println("Total de coelhos: " + Coelhos);
        System.out.println("Total de ratos: " + Ratos);
        System.out.println("Total de sapos: " + Sapos);

        double Percent100 = (Sapos + Ratos + Coelhos);
        double CoelhosP = (100 * Coelhos) / Percent100;
        double RatosP = (100 * Ratos) / Percent100;
        double SaposP = (100 * Sapos) / Percent100;

        System.out.printf("Percentual de coelhos: %.2f", CoelhosP);
        System.out.println(" %");
        System.out.printf("Percentual de ratos: %.2f", RatosP);
        System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f", SaposP);
        System.out.println(" %");

        input.close();
    }
}

//Tem insight