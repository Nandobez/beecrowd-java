import java.util.Scanner;

public class Beecrowd1042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        
        int[] array = {x, y, z};
        int[] arrayPRE = {x, y, z};
        
        sort(array);

        for(int i = 0; i < 3; i++){
            System.out.println(array[i]);
        }
        
        System.out.println("");
        for(int i = 0; i < 3; i++){
            System.out.println(arrayPRE[i]);
        }

        
        input.close();
    }


    public static void sort(int[] array) {
        int n = array.length;

     
        for (int i = 0; i < n - 1; i++) {
         
            for (int j = 0; j < n - i - 1; j++) {
               
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
    }
}
//Insight Bubble Sort