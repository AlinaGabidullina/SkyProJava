package Lesson_6;

public class Ex3 {
    public static void main(String[] args) {
        String firstName= "Ivan";
        String middleName= "Ivanovich";
        String lastName= "Ivanov";
        // "Ivanov Ivan Ivanovich"----"Ivanov; Ivan; Ivanovich"
        String fullName= lastName+ " "+ firstName+ " " + middleName;
        String copyFullName = fullName.replace(" ", "; ") ;
        System.out.println("Данные ФИО сотрудника для административного дела - " + copyFullName);

    }
}
