package Lesson_5;
public class Ex3 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            sum = sum + arr[i]/30;
        }
        System.out.println("—редн€€ сумма трат за мес€ц составила " + sum + " рублей");
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
}
