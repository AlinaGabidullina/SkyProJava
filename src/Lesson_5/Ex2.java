package Lesson_5;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < 30; i++) {
            if (arr[i] > max) {
            }
            if (arr[i] < min) {
            }
            System.out.println(" ������������ ����� �� ���� ��������� " + max + "������ ");
            System.out.println(" ����������� ����� �� ���� ��������� " + min + "������ ");
        }
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
// ������ 30 ��� ���������� ��������
