import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];

        for (int c = 0 ; c < array.length ; c++){
            array[c] = random.nextInt(0, 100);
        }

        sortArray(array);



    }

    public static void sortArray(int[] array){

        int temp = 0;

        for (int c = 1 ; c < array.length ; c++){
            for (int r = c ; r > 0 ; r-- ){
                if (array[r] < array[r-1]){
                    temp = array[r];
                    array[r] = array[r-1];
                    array[r-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}