package Lesson_7;

public class Exsemple {
    public static void main(String[] args) {

        System.out.println("���������, ������� ���������� ���������");

        sendMessage("����");

        System.out.println("����������...");

        sendMessage("����");

        System.out.println("��� ��������� ����������! �� ��������!");
    }
    // [������������] (public/protected/private + static + final) ���_�������������_�������� (int/double/Sting/bool.../void) ��������_������ (������)   ([���������])
    public static void sendMessage(String name){
        System.out.println("������������ ��������� " + name);
        System.out.println("��������� " + name + " ������� ����������");
    }




}
