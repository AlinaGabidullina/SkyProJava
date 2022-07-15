package Lesson_7;

public class Ex4 {
    public static void main(String[] args) {

    }
    public static void checking(String phrase) {

        for (int i = 1; i < phrase.length(); i++) {
            if (phrase.charAt(i - 1) == phrase.charAt(i))
                System.out.println(" Присутсвует дубль" + phrase.charAt(i));
            return;
        }
        System.out.println("Дублей нет");

    }


}


    
    
       
        
    

    
        
 
  

    


    

