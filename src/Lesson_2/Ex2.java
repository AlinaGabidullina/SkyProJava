package Lesson_2;

public class Ex2 {
    public static void main(String[] args) {
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double totalWeight = boxer1 + boxer2;
        System.out.println("общий вес боксеров " + totalWeight + "кг");
        double overload = (boxer2 - boxer1) % totalWeight;
        System.out.println("разница между боксерами " + overload + "кг");
    }
}
