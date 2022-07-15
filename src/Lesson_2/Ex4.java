package Lesson_2;

public class Ex4 {
    public static void main(String[] args) {
        // 1 кг = 1000 грамм
        int needLost = 7;
        int NeedLost = 7 * 1000;
        System.out.println("нужно сбросить " + NeedLost + "грамм");
        int version1 = 250;
        int time1 = 7000 / 250;
        System.out.println("спортсмен потеряет вес при 250гр за " + time1 + "дней");
        int version2 = 500;
        int time2 = 7000 / 500;
        System.out.println("спортсмен потеряет вес при 500гр за " + time2 + "дней");

    }
}
