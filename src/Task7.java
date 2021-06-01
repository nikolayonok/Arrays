import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int a = sc.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(13);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1 < array.length) && (array[i] == array[i + 1])) {
                count++;
            } else {
                System.out.println((count + 1) + " раз(a) встречается " + array[i]);
                count = 0;
            }
        }
    }
}
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if ((i + 1 < array.length) && (array[i] == array[i + 1])) {
//                count++;
//            } else {
//                if (count > 0) {
//                    System.out.println(array[i] + "-" + count + "раз");
//                }
//                count = 0;
//            }
//        }