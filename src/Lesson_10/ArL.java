package Lesson_10;
import java.util.ArrayList;
public class ArL {
    public static void main(String[] args) {
            ArrayList <String >soup=new ArrayList();
            soup.add("water");
            soup.add("chiken");
            soup.add("potato");
            soup.add("carrot");
            soup.add("onion");

            soup.add(4,"salt");
            soup.set(3,"cabbage");
            soup.remove(1);

        for (Object s:soup){
            System.out.print(s+" ");
        }
        System.out.println(soup.size());
            }

        }



