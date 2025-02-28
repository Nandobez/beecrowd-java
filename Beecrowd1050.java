import java.util.Scanner;

public class Beecrowd1050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] destination = {"Brasilia","Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas", "Vitoria", "Belo Horizonte"};
        
        
        int[] ddd = {61,71,11,21,32,19,27,31};
        int N = input.nextInt();
        int not = 1;

        for(int i = 0; i < ddd.length; i++){
            if(N == ddd[i]){
                String print = destination[i];
                System.out.println(print);
                not = 0;
            }
        }

        if(not == 1){
        System.out.println("DDD nao cadastrado");
        }
        input.close();
    }
}
//Tem Insight