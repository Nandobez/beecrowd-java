import java.util.Scanner;

public class Beecrowd1114 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean AP = false;

        char[] Rpassword = {'2', '0', '0', '2'};


        while (AP == false) {
            int check = 0;
            
            String password = input.nextLine();

            if(password.length() == 0){
                password ="0000";
            }else if(password.length() > 0 && password.length() < 4){
                password ="0000";
            }

            char[] run = password.toCharArray();

            
            
            for(int i = 0; i < 4; i++){
                if(Rpassword[i] == run[i]){
                    check++;
                }
            }

            
            if(check == 4){
                System.out.println("Acesso Permitido");
                AP = true;
            }else{
                System.out.println("Senha Invalida");
            }

            
        }

        
        input.close();

    }
}

//Tem insight