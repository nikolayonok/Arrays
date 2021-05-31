public class Task3 {
    public static void main(String[] args) {
        boolean a = true;
        int[] array = new int[]{2, 2, 2, 2, 3};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                a = false;
                break;
            }
        }
        if (a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
