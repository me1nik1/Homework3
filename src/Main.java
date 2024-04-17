public class Main {
    public static void main(String[] args) {

        byte carrot = 3;
        System.out.println("Значение переменной carrot с типом byte равно "+ carrot);
        short beet = 9;
        System.out.println("Значение переменной beet с типом short равно "+ beet);
        int potato = 10;
        System.out.println("Значение переменной potato с типом int равно "+ potato);
        long greenPea = 600L;
        System.out.println("Значение переменной greenPea с типом long равно "+ greenPea);
        float pickles = 11.65f;
        System.out.println("Значение переменной pickles с типом float равно "+ pickles);
        double sunflowerOil = 12.725;
        System.out.println("Значение переменной sunflowerOil с типом double равно "+ sunflowerOil);


        byte a = 67;
        System.out.println(a);
        short b = -159;
        System.out.println(b);
        short c = 569;
        System.out.println(c);
        int d = 27897;
        System.out.println(d);
        long e = 987678965549L;
        System.out.println(e);
        float f = 27.12f;
        System.out.println(f);
        double g = 2.786;
        System.out.println(g);


        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short sheetsPaper = 480;
        int totalStudents = teacher1 + teacher2 + teacher3;
        System.out.println(totalStudents);
        int paperForEachStudent = sheetsPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperForEachStudent + " листов бумаги");


        byte bootle = 16;
        byte minute = 2;
        int outputPerMinute = bootle / minute;
        int productivity20 = outputPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + productivity20 + " штук бутылок");
        int productivityDay = outputPerMinute * 1440;
        System.out.println("За сутки машина произвела " + productivityDay + " штук бутылок");
        int productivity3Day = productivityDay * 3;
        System.out.println("За 3 дня машина произвела " + productivity3Day + " штук бутылок");
        long productivityMonth = productivity3Day * 10;
        System.out.println("За месяц машина произвела " + productivityMonth + " штук бутылок");


        byte paintCan = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int oneClassPaint = whitePaint + brownPaint;
        int classesAtSchool = paintCan / oneClassPaint;
        int purchasedWhitePaint = classesAtSchool * whitePaint;
        int purchasedBrownPaint = classesAtSchool * brownPaint;
        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " + purchasedWhitePaint + " банок белой краски и " + purchasedBrownPaint + " банок коричневой краски");


        byte banana = 5;
        short milk = 200;
        byte iceCream = 2;
        byte egg = 4;
        int bananaWeight = banana * 80;
        float milkWeight = milk * 1.05f;
        int iceCreamWeight = iceCream * 100;
        int eggWeight = egg * 70;
        float totalWeightInGrams = bananaWeight + milkWeight + iceCreamWeight + eggWeight;
        System.out.println("Вес спортзавтрака " + totalWeightInGrams + " грамм");
        float totalWeightInKg = totalWeightInGrams / 1000f;
        System.out.println("Вес спортзавтрака " + totalWeightInKg + " килограмм");


        byte loseWeight = 7;
        short forDay250 = 250;
        float kg250 = forDay250 / 1000f;
        float day250 = loseWeight / kg250;
        System.out.println("Если спортсмен будет худеть каждый день по " + forDay250 + " грамм, то на похудение уйдет " + day250 + " дней" );
        short forDay500 = 500;
        float kg500 = forDay500 / 1000f;
        float day500 = loseWeight / kg500;
        System.out.println("Если спортсмен будет худеть каждый день по " + forDay500 + " грамм, то на похудение уйдет " + day500 + " дней" );


       int monthlySalary1 = 67760;
       int monthlySalary2 = 83690;
       int monthlySalary3 = 76230;
       int increaseMonthlySalary1 = monthlySalary1 * 10 / 100 + monthlySalary1;
       int increaseMonthlySalary2 = monthlySalary2 * 10 / 100 + monthlySalary2;
       int increaseMonthlySalary3 = monthlySalary3 * 10 / 100 + monthlySalary3;
       int yearSalary1 = monthlySalary1 * 12;
       int yearSalary2 = monthlySalary2 * 12;
       int yearSalary3 = monthlySalary3 * 12;
       int increaseYearSalary1 = increaseMonthlySalary1 * 12;
       int increaseYearSalary2 = increaseMonthlySalary2 * 12;
       int increaseYearSalary3 = increaseMonthlySalary3 * 12;
       int incomeDifference1 = increaseYearSalary1 - yearSalary1;
       System.out.println("Маша теперь получает " + increaseMonthlySalary1 + " рублей. Годовой доход вырос на " + incomeDifference1 + " рублей");
       int incomeDifference2 = increaseYearSalary2 - yearSalary2;
       System.out.println("Денис теперь получает " + increaseMonthlySalary2 + " рублей. Годовой доход вырос на " + incomeDifference2 + " рублей");
       int incomeDifference3 = increaseYearSalary3 - yearSalary3;
       System.out.println("Кристина теперь получает " + increaseMonthlySalary3 + " рублей. Годовой доход вырос на " + incomeDifference3 + " рублей");

    }
}