public class Task4 {
    public static void main(String[] args) {
        int a = 0;
        int[] array = new int[]{2, 2, 2, 2, 2};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                a++;
            }
        }
        if (a != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
