package Lesson_4;

public class Ex3 {

    public static void main(String[] args) {
        int current_year = 2021;
        for (int i = current_year - 200; i <= current_year + 100; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

    }
}
