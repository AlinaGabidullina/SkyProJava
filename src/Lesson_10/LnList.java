package Lesson_10;

import java.util.LinkedList;

public class LnList {
    public static void main(String[] args) {
        LinkedList<String>salat=new LinkedList<>();
        salat.add("cucamber");
        salat.add("onion");
        salat.add("tomato");
        salat.add("olives");
        salat.getLast();
        salat.getFirst();
        salat.remove(3);
        salat.set(2,"cherri");
        for (String t:salat) {
            System.out.println(t);

        }

        }

    }

