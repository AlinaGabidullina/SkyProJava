package Lesson_3;

public class Ex3 {
    public static void main(String[] args) {
        // каждый 4 год, но не 100. И  каждый 400 является високосным
        int year =2022;
        if (year %4 ==0 && year %100 !=0 ) {  //каждый  4- %4==0 , каждый не 100- %100 !=0
            System.out.println(" Год является високосным");
        } else if ( year % 400 ==0) {  //каждый 100- %400 == 0
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным ");
        }
    }
}
