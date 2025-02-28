import java.util.Scanner;

public class Beecrowd1052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        String[] mes = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        System.out.println(mes[N-1]);
        input.close();
    }
}
