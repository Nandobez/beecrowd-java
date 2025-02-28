import java.util.*;

public class Beecrowd1523 {
    static class Carro {
        int chegada;
        int saida;
        
        Carro(int chegada, int saida) {
            this.chegada = chegada;
            this.saida = saida;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int N = scanner.nextInt();
            int K = scanner.nextInt(); 
            
            if (N == 0 && K == 0) {
                break;
            }
            
       
            List<Carro> carros = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int chegada = scanner.nextInt();
                int saida = scanner.nextInt();
                carros.add(new Carro(chegada, saida));
            }
            
            System.out.println(verificaEstacionamento(carros, K) ? "Sim" : "Nao");
        }
        
        scanner.close();
    }
    
    private static boolean verificaEstacionamento(List<Carro> carros, int K) {
        Stack<Carro> estacionamento = new Stack<>();
        //Stack<Carro> rua = new Stack<>();
        
        for (Carro carroAtual : carros) {
            
            while (!estacionamento.isEmpty() && estacionamento.peek().saida <= carroAtual.chegada) {
                estacionamento.pop();
            }
            
            
            if (estacionamento.size() >= K) {
                return false;
            }
            
          
            boolean possivelEstacionar = true;
            Stack<Carro> tempEstacionamento = new Stack<>();
            //Stack<Carro> tempRua = new Stack<>();
            
         
            tempEstacionamento.addAll(estacionamento);
            
           
            tempEstacionamento.push(carroAtual);
            
      
            for (Carro carro : tempEstacionamento) {
                if (carro.saida < carroAtual.saida) {
                  
                    possivelEstacionar = false;
                    break;
                }
            }
            
            if (!possivelEstacionar) {
                return false;
            }
            
      
            estacionamento.push(carroAtual);
        }
        
        return true;
    
    }
}