import java.util.Scanner;

class Beecrowd1134 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alc = 0;
        int gas = 0;
        int die = 0;
        int exit = 0;

        while(!(exit == 4)){
        
                int N = input.nextInt();

                if(N == 1){
                    alc++;
                }else if(N == 2){
                    gas++;
                }else if(N == 3){
                    die++;
                }

                exit = N;
        }   

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + die);
        input.close();
    }
}
