import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(20) - 10;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i] && j != i) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Индекс - " + i + " значение " + array[i]);
            }
        }
    }
}
