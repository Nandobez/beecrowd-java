import java.util.Scanner;

public class Beecrowd1046 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int x = input.nextInt();
    int y = input.nextInt();
    int calc = (x-y +24) % 24;

    
    System.out.println("O JOGO DUROU "+ calc +" HORA (S)");
    input.close();
 }   
}
//Tem insight