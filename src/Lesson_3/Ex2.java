package Lesson_3;

public class Ex2 {
    public static void main(String[] args) {
        int clientDeviceYear = 2015;
        int clientsiOs = 2020;
        if (clientDeviceYear < 2015) {
            if (clientsiOs == 0) {
                System.out.println(" Установите облегченную версию  для iOs ");
            } else if (clientsiOs == 1 ) {
                System.out.println(" Установите облегченную версию для Android ");
            } else {
                if (clientsiOs == 0) {
                    System.out.println(" Установите  версию  для iOs");
                } else if (clientsiOs == 1) {
                    System.out.println("Установите версию для Android ");
                }

            }
        }
    }
}
// проблема в условиях, дальше 2020 не идет
