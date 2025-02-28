import java.util.*;

public class Beecrowd3139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        long N = scanner.nextLong();
        long M = scanner.nextLong();
        
        
        int[] ultimosDias = new int[30];
        
        
        for (int i = 0; i < 30; i++) {
            ultimosDias[i] = scanner.nextInt();
        }
        
       
        int dias = 0;
        long seguidoresAtuais = N;
        int posicaoAtual = 0;
        
        
        while (seguidoresAtuais < M) {
        
            double media = 0;
            for (int i = 0; i < 30; i++) {
                media += ultimosDias[i];
            }
            media = media / 30;
            
            
            int novosSeguidores = (int) Math.ceil(media);
            
          
            seguidoresAtuais += novosSeguidores;
            
          
            ultimosDias[posicaoAtual] = novosSeguidores;
            posicaoAtual = (posicaoAtual + 1) % 30;
            
            dias++;
        }
        
        System.out.println(dias);
        
        scanner.close();
    }
}