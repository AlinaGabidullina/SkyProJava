package Lesson_6;

public class Ex4 {
    public static void main(String[] args) {

        String fullName= "Иванов Иван Иванович";

        if (fullName.contains("ё")){
            String f = fullName.replace("ё", "е");
            System.out.println("Данные ФИО сотрудника — " + f);
        } else {
            System.out.println("Данные ФИО сотрудника — " + fullName);
        }

    }
}
