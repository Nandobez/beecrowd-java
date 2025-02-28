import java.util.*;

public class Beecrowd1548 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int N = scanner.nextInt();
        

        for (int caso = 0; caso < N; caso++) {
         
            int M = scanner.nextInt();
            
            
            int[] filaOriginal = new int[M];
            int[] filaOrdenada = new int[M];
            
            
            for (int i = 0; i < M; i++) {
                filaOriginal[i] = scanner.nextInt();
                filaOrdenada[i] = filaOriginal[i];
            }
            
            
            Arrays.sort(filaOrdenada);
            reverterArray(filaOrdenada);
            
            
            int alunosNaMesmaPosicao = 0;
            for (int i = 0; i < M; i++) {
                if (filaOriginal[i] == filaOrdenada[i]) {
                    alunosNaMesmaPosicao++;
                }
            }
            
           
            System.out.println(alunosNaMesmaPosicao);
        }
        
        scanner.close();
    }
    

    private static void reverterArray(int[] array) {
        int inicio = 0;
        int fim = array.length - 1;
        while (inicio < fim) {
            int temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;
            inicio++;
            fim--;
        }
    }
}