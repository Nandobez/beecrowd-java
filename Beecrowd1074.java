import java.util.Scanner;

class Beecrowd1074{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i = 0; i < N; i++){

            int X = input.nextInt();

            if(X == 0){
                System.out.print("NULL");
            }else{

                if(X % 2 == 0){
                    System.out.print("EVEN ");
                }else{
                    System.out.print("ODD ");
                }

                
                if(X > 0){
                    System.out.print("POSITIVE");
                }else{
                    System.out.print("NEGATIVE");
                }
            }

            System.out.println("");
        }

        input.close();
    }
}