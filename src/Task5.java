import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(20) - 10;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1 < array.length) && (array[i] == array[i + 1])) {
                count++;
            } else {
                if (count > 0) {
                    System.out.println(array[i] + "-" + count + "раз");
                }
            }
        }
    }
}
