package Lesson_7;

public class Ex2 {
    public static void checkingVersion(int clientDeviceYear, int clientsiOs) {
        if (clientDeviceYear < 2015) {
            if (clientsiOs == 0) {
                System.out.println("Установите облегченную версию для iOs ");
            } else if (clientsiOs == 1) {
                System.out.println("Установите облегченную версию для Android ");
            }
        } else {
            if (clientsiOs == 0) {
                System.out.println("Установите версию для iOs");
            } else if (clientsiOs == 1) {
                System.out.println("Установите версию для Android ");
            }
        }
    }

    public static void main(String[] args) {
        int clientDeviceYear = 2020;
        int clientsiOs = 0;
        checkingVersion(clientDeviceYear, clientsiOs);
    }
}
