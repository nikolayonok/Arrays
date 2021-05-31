import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(120) - 70;
        }
        Arrays.sort(array);
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);
    }
}
