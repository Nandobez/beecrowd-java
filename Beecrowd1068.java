import java.util.Scanner;

public class Beecrowd1068 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (input.hasNext()) {

	        String expressao = input.nextLine();
	        int abertos = 0;
	        boolean errado = false;
            
	        for (int i = 0; i < expressao.length(); i++) {
				char caracter = expressao.charAt(i);
				if (caracter == ')') {
					if (abertos == 0) {
						errado = true;
						break;
					}
					abertos--;
				} else if (caracter == '(') {
					abertos++;
				}
			}
        	if (errado || abertos > 0) {
	            System.out.println("incorrect");	
	        } else {
	            System.out.println("correct");
	        }
		}
		input.close();
    	
	}

}
