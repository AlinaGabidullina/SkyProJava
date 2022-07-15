package Lesson_2;

public class Ex5 {
    public static void main(String[] args) {
        double Masha = 67760;
        double Denis = 83690;
        double Cristina = 76230;
        // 10% = 0.1
        double BonusSalaryMashaMonth = Masha * 0.1;
        double BonusSalaryMashaYear = BonusSalaryMashaMonth * 12;
        double SalaryMashaYear = Masha* 12;
        double SalaryBonusMashaYear = SalaryMashaYear + BonusSalaryMashaYear;
        System.out.println("годовая зарплата Маши составляет " + SalaryBonusMashaYear + "руб ");
        System.out.println( "годовой доход Маши увеличился на " + BonusSalaryMashaYear +"руб");
        double BonusSalaryDenisMonth = Denis * 0.1;
        double BonusSalaryDenisYear = BonusSalaryDenisMonth *12;
        double SalaryDenisYear= Denis * 12;
        double SalaryBonusDenisYear = SalaryDenisYear + BonusSalaryDenisYear;
        System.out.println("годовая зарплата Дениса составляет " + SalaryBonusDenisYear + "руб ");
        System.out.println( "годовой доход Дениса увеличился на " + BonusSalaryDenisYear +"руб");
        double BonusSalaryCristinaMonth = Cristina * 0.1;
        double BonusSalaryCristinaYear = BonusSalaryCristinaMonth * 12;
        double SalaryCristinaYear = Cristina* 12;
        double SalaryBonusCristinaYear = SalaryCristinaYear + BonusSalaryCristinaYear;
        System.out.println("годовая зарплата Кристины составляет " + SalaryBonusCristinaYear + "руб ");
        System.out.println( "годовой доход Кристины увеличился на " + BonusSalaryCristinaYear +"руб");
    }
}
