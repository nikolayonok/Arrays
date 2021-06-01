import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(n) - 2;
        }
        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        int[] array2 = new int[n];
        array2 = Arrays.copyOf(array, array.length);
        int a = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= -1) {
                if (array[i] < 0) {
                    array2[i] = array[i] * array[i];
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

    }
}
