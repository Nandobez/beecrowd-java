import java.util.Scanner;

public class Beecrowd1180 {


    public static void insertionSort(int[] vetor){
        int n = vetor.length;

        for(int i = 1; i < n; i++){

            int chave = vetor[i];

            int j = i - 1;

            while(j >= 0 && vetor[j] > chave){
                vetor[j+1] = vetor[j];
                j--;
            }

            vetor[j+1] = chave;
        }
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[] vetor = new int[N];
        int [] vetorComp = new int[N];

        for(int i = 0; i < N; i++){
            vetor[i] = input.nextInt();
        }

        for(int i = 0; i < N; i++){
            vetorComp[i] = vetor[i];
        }
        
        insertionSort(vetor);
        int pos = 0;

        for(int i = 0; i < N; i++){
            if(vetorComp[i] == vetor[0]){
                pos = i;
                break;
            }
        }

        System.out.println("Menor valor: " + vetor[0]);
        System.out.println("Posicao: " + pos);
        input.close();
    }
}