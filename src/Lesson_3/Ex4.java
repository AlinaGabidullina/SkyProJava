package Lesson_3;

public class Ex4 {
    public static void main(String[] args) {
        int deliveryDistance= 100;
        if (deliveryDistance<20 ){  //������ 20�� ������������ �����
            System.out.println("����������� ����� ��� ��������");
        } else {
            int days =1;
            int delta =( deliveryDistance-20)/40;  //������ ������� =����� 40�� , �� ���������� ����� �� 40 � 20- ��� ��� �����
            days=days + delta + 1;
            System.out.println("����������� " + days + "���� ��� ��������");
        }
    }
}
