package Lesson_7;

public class Exsemple {
    public static void main(String[] args) {

        System.out.println("Программа, которая отправляет сообщения");

        sendMessage("Коле");

        System.out.println("Продолажем...");

        sendMessage("Васе");

        System.out.println("Все сообщения отправлены! До свидания!");
    }
    // [модифакоторы] (public/protected/private + static + final) тип_возвращаемого_значения (int/double/Sting/bool.../void) название_метода (глагол)   ([пареметры])
    public static void sendMessage(String name){
        System.out.println("Отправляется сообщение " + name);
        System.out.println("Сообщение " + name + " успешно отправлено");
    }




}
