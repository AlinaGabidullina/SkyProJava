package Lesson_7;

public class Ex3 {
    public static void comingDelivery (int deliveryDistance, int days){
        if (deliveryDistance < 20) {  //меньше 20км понадобиться сутки
            System.out.println("Потребуется сутки для доставки");
        } else {
            int delta = (deliveryDistance - 20) / 40;  //равные отрезки =равны 40км , то расстояние делим на 40 и 20- это еще сутки
            days = days + delta + 1;
            System.out.println("Потребуется " + days + " дней для доставки");
        }
    }

    public static void main(String[] args) {
        int deliveryDistance = 100;
        int days = 1;
       comingDelivery(deliveryDistance, days);
    }
}
