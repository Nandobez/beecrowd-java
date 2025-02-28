import java.util.Scanner;

public class Beecrowd1165 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i = 0; i < N; i++){
            int X = input.nextInt();
            int other = 0;
            
            
            for(int j = 2; j < X; j++){

                if(X % j == 0){
                    other = 1;
                }

            }
            
            if(other == 1){
                System.out.println(X + " nao eh primo");
            }else{
                System.out.println(X + " eh primo");
            }
            
            other = 0;
        }

        input.close();
    }
    
}
