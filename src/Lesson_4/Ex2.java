package Lesson_4;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(" exercise 2 ");
        // month=31 days;  friday=5
        for (int i = 1; i <= 31; i++) {
            if (i % 5 == 0) {
                System.out.println("сегодня пятница, " + i + " число");
            }
        }


    }
}
