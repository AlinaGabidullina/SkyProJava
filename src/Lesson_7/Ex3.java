package Lesson_7;

public class Ex3 {
    public static void comingDelivery (int deliveryDistance, int days){
        if (deliveryDistance < 20) {  //������ 20�� ������������ �����
            System.out.println("����������� ����� ��� ��������");
        } else {
            int delta = (deliveryDistance - 20) / 40;  //������ ������� =����� 40�� , �� ���������� ����� �� 40 � 20- ��� ��� �����
            days = days + delta + 1;
            System.out.println("����������� " + days + " ���� ��� ��������");
        }
    }

    public static void main(String[] args) {
        int deliveryDistance = 100;
        int days = 1;
       comingDelivery(deliveryDistance, days);
    }
}
