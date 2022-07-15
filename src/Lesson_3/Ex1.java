package Lesson_3;
public class Ex1 {
    public static void main(String[] args) {
        int clientsOs = 0;
        //для сравнения между переменными используется 1 переменная, в противном случае будет другая
        if (clientsOs == 0) {
            System.out.println("Установите версию для приложения iOs по ссылке");
        }
        else if ( clientsOs ==1) {
            System.out.println( "Установите версию для приложения Android по ссылке");
        }
    }
}
