import java.util.Scanner;

public class Beecrowd1133 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N1 = input.nextInt();
        int N2 = input.nextInt();


        if(N1 > N2){
            int temp = N1;
            N1 = N2;
            N2 = temp;
        }

        for(int i = N1 + 1; i < N2; i++){
            if(i % 5 == 2 && i % 5 == 3){
                System.out.println(i);
            }else if(i % 5 == 2){
                System.out.println(i);
            }else if(i % 5 == 3){
                System.out.println(i);
            }
        }
        
        input.close();
    }
}
