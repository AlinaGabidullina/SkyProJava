package Lesson_6;

public class Ex4 {
    public static void main(String[] args) {

        String fullName= "������ ���� ��������";

        if (fullName.contains("�")){
            String f = fullName.replace("�", "�");
            System.out.println("������ ��� ���������� � " + f);
        } else {
            System.out.println("������ ��� ���������� � " + fullName);
        }

    }
}
