import java.util.Scanner;

public class Beecrowd1179 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        
        int N = 3;
        int j = 0;
        int k = 0;

        int[] main = new int[N];
        int[] par = new int[N];
        int[] impar = new int[N];

        for(int i = 0; i < N; i++){
            main[i] = input.nextInt();
        }

        for(int i = 0; i < N; i++){

            if(main[i] % 2 == 0){

                if(N < N-1){
                    par[j] = main[i];
                    j++;
                }
                
            }else if(main[i] % 2 != 0){

                if(N < N-1){
                    impar[k] = main[i];
                    k++;
                }

            }else if(main[i] == 0){

                if(N < N-1){
                    par[j] = main[i];
                    j++;
                }

            }

        }
        
        

        for(int i = 0; i < impar.length; i++){
            System.out.println("Impares: " + impar[i]);
        }


        System.out.println(" ");
        
        for(int i = 0; i < par.length; i++){
            System.out.println("Pares: " + par[i]);
        }
        
    }
}
