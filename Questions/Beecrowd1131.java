import java.util.Scanner;

public class Beecrowd1131 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int out = 0;
        int gren = 0;
        int gV = 0;
        int iV = 0;
        int emp = 0;

        while (out != 2) {
            int inter = input.nextInt();
            int gremio = input.nextInt();
            gren++;
            if(inter == gremio){
                emp++;
            }else if(inter > gremio){
                iV++;
            }else if(gremio > inter){
                gV++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            out = input.nextInt();
        }


        System.out.println(gren + " grenais");
        System.out.println("Inter:" + iV);
        System.out.println("Gremio:" + gV);
        System.out.println("Empates:" + emp);

        if(iV == gV){
            System.out.println("Não houve vencedor");
        }else if(iV > gV){
            System.out.println("Inter venceu mais");

        }else if(gV > iV){
            System.out.println("Gremio venceu mais");
        }
        input.close();
    }
}
