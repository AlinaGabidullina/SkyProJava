package Lesson_3;

public class Ex3 {
    public static void main(String[] args) {
        // ������ 4 ���, �� �� 100. �  ������ 400 �������� ����������
        int year =2022;
        if (year %4 ==0 && year %100 !=0 ) {  //������  4- %4==0 , ������ �� 100- %100 !=0
            System.out.println(" ��� �������� ����������");
        } else if ( year % 400 ==0) {  //������ 100- %400 == 0
            System.out.println("��� �������� ����������");
        } else {
            System.out.println("��� �� �������� ���������� ");
        }
    }
}
