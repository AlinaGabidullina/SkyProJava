package Lesson_7;

public class Ex1 {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {  //������  4- %4==0 , ������ �� 100- %100 !=0
            return true;
        } else if (year % 400 == 0) {  //������ 100- %400 == 0
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2022;
        boolean isLeap = isLeapYear(year);
        if (isLeap){
            System.out.println(year + " - ���������� ���");
        } else {
            System.out.println(year + " - �� ���������� ���");
        }
    }
}
