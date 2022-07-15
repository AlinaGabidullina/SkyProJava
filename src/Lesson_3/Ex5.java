package Lesson_3;

public class Ex5 {
    public static void main(String[] args) {
        int monthNumber =12;
        if (monthNumber> 12) {
            System.out.println(" Такого месяца не существует");
        } else {
            switch (monthNumber) {
                case 1 :
                    System.out.println(" зима ");
                case 2 :
                    System.out.println(" зима ");
                    break;
                case 3 :
                    System.out.println(" весна ");
                    break;
                case 4:
                    System.out.println(" весна ");
                    break;
                case 5 :
                    System.out.println(" весна ");
                    break;
                case 6 :
                    System.out.println(" лето ");
                    break;
                case 7 :
                    System.out.println(" лето ");
                    break;
                case 8 :
                    System.out.println(" лето ");
                    break;
                case 9 :
                    System.out.println(" осень ");
                    break;
                case 10 :
                    System.out.println(" осень ");
                    break;
                case 11 :
                    System.out.println(" осень ");
                    break;
                case 12 :
                    System.out.println(" зима ");
            }
        }
    }
}
