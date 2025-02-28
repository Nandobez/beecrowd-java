import java.util.Scanner;

public class Beecrowd1142 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int inc = 0;
        for(int i = 1; i < (N * 4) + 1; i++){
            if(inc < 3){
                System.out.print(i + " ");
                inc++;
            }else{
                System.out.println("PUM");
                inc = 0;
            }
            
            
        }

        input.close();
    }
    
}
// Otimizar