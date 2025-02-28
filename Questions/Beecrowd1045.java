import java.util.Locale;
import java.util.Scanner;

class Beecrowd1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        
        
        double temp;
        if (B > A) {
            temp = A;
            A = B;
            B = temp;
        }
        if (C > A) {
            temp = A;
            A = C;
            C = temp;
        }
        if (C > B) {
            temp = B;
            B = C;
            C = temp;
        }
        
      
        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
           
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            
            
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOCELES");
            }
        }
        
        input.close();
    }
}

//Tem insight