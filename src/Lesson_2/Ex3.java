package Lesson_2;

public class Ex3 {
    public static void main(String[] args) {
        int Bananas = 5;
        // 1 banana = 80 g
        int weightBananas = Bananas * 80;
        System.out.println(" ��� ������� " + weightBananas + "�����");
        int Milk = 200;
        // Milk 100ml = 105g
        int weightMilk = 2 * 105;
        System.out.println("��� ������ " + weightMilk + "�����");
        int IceCream = 2;
        // 1ce Cream = 100g
        int weightIceCream =IceCream  * 100;
        System.out.println(" ��� ����������� " + weightIceCream + "�����");
        int Eggs = 4;
        // 1 egg= 70 g
        int weightEggs =Eggs  * 70;
        System.out.println("��� ��� " + weightEggs + "�����");
        int totalWeightBreakfast = weightBananas + weightMilk + weightIceCream + weightEggs;
        System.out.println("��� �������� " + totalWeightBreakfast + "�����");
        // 1 �� = 1000��
        float TotalWeightBreakfast = 1090 / 1000;
        System.out.println("��� �������� " + TotalWeightBreakfast + "��");

    }
}
