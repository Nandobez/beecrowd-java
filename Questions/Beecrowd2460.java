import java.util.*;

public class Beecrowd2460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int N = scanner.nextInt();
        
       
        List<Integer> fila = new ArrayList<>();
        
       
        for (int i = 0; i < N; i++) {
            fila.add(scanner.nextInt());
        }
        
       
        int M = scanner.nextInt();
        
     
        for (int i = 0; i < M; i++) {
        
            int pessoaSaiu = scanner.nextInt();
            
       
            int indice = fila.indexOf(pessoaSaiu);
            if (indice != -1) {
                fila.remove(indice);
            }
        }
        
    
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < fila.size(); i++) {
            resultado.append(fila.get(i));
            if (i < fila.size() - 1) {
                resultado.append(" ");
            }
        }
        System.out.println(resultado.toString());
        
        scanner.close();
    }
}