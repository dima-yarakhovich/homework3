public class Main {
    public static void main(String[] args) {
        // Задача 1//
        int a=5;
        System.out.println("Значение переменной a с типом int  равно " + a);
        byte b=120;
        System.out.println("Значение переменной b с типом byte  равно " + b);
        short c=1230;
        System.out.println("Значение переменной c с типом short  равно " + c);
        long d= 536_111L;
        System.out.println("Значение переменной d с типом long  равно " + d);
        float e=32.356f;
        System.out.println("Значение переменной e с типом float  равно " + e);
        double g=0.785263444;
        System.out.println("Значение переменной g с типом double  равно " + g);

        //Задача 2//
        float variableF=27.12f;
        long variableL=987_678_965_549L;
        double variableD=2.786;
        char variableC=569;
        boolean variableBo=false;
        byte variableB=67;
        short variableS1=-159;
        int variableI=27897;

        //Задача 3//
        int classOne=23;
        int classTwo=27;
        int classThree=30;
        int paperTotal=480;
        int paperOneStudent=480/(classOne+classTwo+classThree);
        System.out.println("На каждого ученика рассчитано "+ paperOneStudent +" листов бумаги");


        //Задача 4 //
        int capacityOneMin=16/2;
        int capacity20Min=20*capacityOneMin;
        System.out.println("За 20 минут машина произвела "+capacity20Min + " бутылок");
        int capacityOneDay=60*24*capacityOneMin;
        System.out.println("За сутки машина произвела "+ capacityOneDay + " бутылок");
        int capacityThreeDay=3*capacityOneDay;
        System.out.println("За 3 суток машина произвела "+ capacityThreeDay + " бутылок");
        int capacityMonth=31*capacityOneDay;
        System.out.println("За месяц машина произвела "+ capacityMonth + " бутылок");

        //Задача 5//
        int bankTotal=120;
        int bankWhiteOneClass=2;
        int bankBrawnOneClass=4;
        int totalClass=bankTotal/(bankWhiteOneClass+bankBrawnOneClass);
        int bankWhiteTotal=totalClass*bankWhiteOneClass;
        int bankBrawnTotal=totalClass*bankBrawnOneClass;
        System.out.println("В школе, где "+ totalClass +" классов, нужно "+ bankWhiteTotal +" банок белой краски и "+ bankBrawnTotal +" банок коричневой краски.");


        //Задача 6//
        int weight1Banana=80;
        int weight5Bananas=5*weight1Banana;
        int weight100Milk=105;
        int weight200Milk=2*weight100Milk;
        int weight1Ice=100;
        int weight2Ice=2*weight1Ice;
        int weight1Egg=70;
        int weight4Eggs=4*weight1Egg;
        int weightTotalGr=weight5Bananas+weight200Milk+weight2Ice+weight4Eggs;
        float weightTotalKg=weightTotalGr/1000f;
        System.out.println("Масса спортивного завтрака составляет "+weightTotalKg+" килограмм");

        //Задача 7//
        int weightTotalSportsmanKg=7;
        int weightTotalSportsmanGr=weightTotalSportsmanKg*1000;
        int totalDays250=weightTotalSportsmanGr/250;
        int totalDays500=weightTotalSportsmanGr/500;
        System.out.println("Если спортсмен будет терять по 250 гр в день, то ему понадобится " + totalDays250 + " дней.");
        System.out.println("Если спортсмен будет терять по 500 гр в день, то ему понадобится " + totalDays500 + " дней.");
        int totalDaysMean=(totalDays250+totalDays500)/2;
        System.out.println("Для похудения спортсмена в среднем необходим " + totalDaysMean + " день.");

        //Задача 8//

        int moneyMMonth=67_760;
        int moneyDMonth=83_690;
        int moneyKMonth=76_230;
        float moneyMMonthTop=moneyMMonth*1.1F;
        float moneyDMonthTop=moneyDMonth*1.1F;
        float moneyKMonthTop=moneyKMonth*1.1F;
        float moneyMYearsTop=moneyMMonthTop*12F;
        float moneyDYearsTop=moneyDMonthTop*12F;
        float moneyKYearsTop=moneyKMonthTop*12F;
        float moneyMYearsDif=moneyMYearsTop%(moneyMMonth*12F);
        float moneyDYearsDif=moneyDYearsTop%(moneyDMonth*12F);
        float moneyKYearsDif=moneyKYearsTop%(moneyKMonth*12F);
        System.out.println("Маша теперь получает "+moneyMMonthTop+" рублей. Годовой доход вырос на "+moneyMYearsDif+" рублей.");
        System.out.println("Денис теперь получает "+moneyDMonthTop+" рублей. Годовой доход вырос на "+moneyDYearsDif+" рублей.");
        System.out.println("Кристина теперь получает "+moneyKMonthTop+" рублей. Годовой доход вырос на "+moneyKYearsDif+" рублей.");
































    }
}