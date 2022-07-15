package Lesson_2;

public class Ex3 {
    public static void main(String[] args) {
        int Bananas = 5;
        // 1 banana = 80 g
        int weightBananas = Bananas * 80;
        System.out.println(" вес бананов " + weightBananas + "грамм");
        int Milk = 200;
        // Milk 100ml = 105g
        int weightMilk = 2 * 105;
        System.out.println("вес молока " + weightMilk + "грамм");
        int IceCream = 2;
        // 1ce Cream = 100g
        int weightIceCream =IceCream  * 100;
        System.out.println(" вес мороженного " + weightIceCream + "грамм");
        int Eggs = 4;
        // 1 egg= 70 g
        int weightEggs =Eggs  * 70;
        System.out.println("вес €иц " + weightEggs + "грамм");
        int totalWeightBreakfast = weightBananas + weightMilk + weightIceCream + weightEggs;
        System.out.println("вес завтрака " + totalWeightBreakfast + "грамм");
        // 1 кг = 1000гр
        float TotalWeightBreakfast = 1090 / 1000;
        System.out.println("вес завтрака " + TotalWeightBreakfast + "кг");

    }
}
