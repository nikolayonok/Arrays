public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int c : arr) {
            if (c % 2 == 0) {
                System.out.println(c);
            }
        }
    }
}
