import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int n = sc.nextInt();
        char[] array = new char[n];
        for (int i = 0; i < array.length; i++) {
            int a = new Random().nextInt(26) + 97;
            array[i] = (char) a;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1 < array.length) && (array[i] == array[i + 1])) {
                count++;
            } else {
                if (count >= 3) {
                    System.out.println(array[i] + " - " + count + " раз");
                }
                count = 1;
            }
        }
    }
}