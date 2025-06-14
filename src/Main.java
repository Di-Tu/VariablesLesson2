//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println();
        System.out.println("                Задача №1");
        int variableInt = -2_147_483_648;
        byte variableByte = 127;
        short variableShort = -32_768;
        long variableLong = 9_223_372_036_854_775_807L;
        float variableFloat = -25.777_77F;
        double variableDouble = 25.777_777_777_7;
        System.out.println("Значение переменной variableInt с типом int равно " + variableInt);
        System.out.println("Значение переменной variableByte с типом byte равно " + variableByte);
        System.out.println("Значение переменной variableShort с типом short равно " + variableShort);
        System.out.println("Значение переменной variableLong с типом long равно " + variableLong);
        System.out.println("Значение переменной variableFloat с типом float равно " + variableFloat);
        System.out.println("Значение переменной variableDouble с типом double равно " + variableDouble);

        System.out.println();
        System.out.println("                Задача №2");
        float v1 = 27.12F;
        long v2 = 987_678_965_549L;
        float v3 = 2.786F;
        short v4 = 569;
        short v5 = -159;
        short v6 = 27897;
        byte v7 = 67;
        System.out.println("Значение " + v1 + " тип float");
        System.out.println("Значение " + v2 + " тип long");
        System.out.println("Значение " + v3 + " тип float");
        System.out.println("Значение " + v4 + " тип short");
        System.out.println("Значение " + v5 + " тип short");
        System.out.println("Значение " + v6 + " тип short");
        System.out.println("Значение " + v7 + " тип byte");

        System.out.println();
        System.out.println("                Задача №3");
        byte teacherLP = 23;
        byte teacherAS = 27;
        byte teacherEA = 30;
        short totalPapers = 480;
        byte totalStudents = (byte) (teacherLP + teacherAS + teacherEA);
        byte perStudent = (byte) (totalPapers / totalStudents);
        System.out.println("На каждого ученика рассчитано " + perStudent + " листов бумаги.");

        System.out.println();
        System.out.println("                Задача №4");
        byte theMachineProduces = 16;
        byte inMinutes = 2;
        byte bottleProductionPerMinute = (byte) (theMachineProduces / inMinutes);
        byte time1 = 20;
        byte time2 = 1;
        byte time3 = 3;
        byte time4 = 1;
//        Считаем сколько минут в каждом отрезке времени, начиная со второго
        short minutesTime2 = (short) (60 * 24 * time2);
        short minutesTime3 = (short) (60 * 24 * time3);
//        Считаем в месяце 30 дней
        int minutesTime4 = 60 * 24 * time4 * 30;
//        Считаем сколько произедено
        short bottleProduction1 = (short) (bottleProductionPerMinute * time1);
        short bottleProduction2 = (short) (bottleProductionPerMinute * minutesTime2);
        int bottleProduction3 = bottleProductionPerMinute * minutesTime3;
        int bottleProduction4 = bottleProductionPerMinute * minutesTime4;
        System.out.println("За " + time1 + " минут машина произвела " + bottleProduction1 + " штук бутылок.");
        System.out.println("За " + time2 + " сутки машина произвела " + bottleProduction2 + " штук бутылок.");
        System.out.println("За " + time3 + " дня машина произвела " + bottleProduction3 + " штук бутылок.");
        System.out.println("За " + time4 + " месяц машина произвела " + bottleProduction4 + " штук бутылок.");

        System.out.println();
        System.out.println("                Задача №5");
        byte totalCans = 120;
        byte oneRoomOfWhitePaint = 2;
        byte oneRoomOfBrownPaint = 4;
        byte oneRoomTotalPaint = (byte) (oneRoomOfWhitePaint + oneRoomOfBrownPaint);
        byte totalRooms = (byte) (totalCans / oneRoomTotalPaint);
        byte totalWhitePaint = (byte) (totalRooms * oneRoomOfWhitePaint);
        byte totalBrownPaint = (byte) (totalRooms * oneRoomOfBrownPaint);
        System.out.println("В школе, где " + totalRooms + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

        System.out.println();
        System.out.println("                Задача №6");
        byte bananas = 5;
        byte bananaWeight = 80;
        short milk = 200;
        byte milkWeight = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte egg = 4;
        byte eggWeight = 70;
//        System.out.println("Завтрак спортсмена весит " + (bananas * bananaWeight + milk / 100 * milkWeight + iceCream * iceCreamWeight + egg * eggWeight) + " грамм или " + ((bananas * bananaWeight + milk / 100 * milkWeight + iceCream * iceCreamWeight + egg * eggWeight) / 1000f) + " килограмм" );
//      Считаем сколько грамм
        short totalGram = (short) (bananas * bananaWeight + milk / 100 * milkWeight + iceCream * iceCreamWeight + egg * eggWeight);
//        Пересчитываем в килограммы
        float totalKilo = totalGram / 1000F;
        System.out.println("Завтрак спортсмена весит " + totalGram + " грамм или " + totalKilo + " килограмм");

        System.out.println();
        System.out.println("                Задача №7");
        byte reduceWeight = 7;
        short reduceWeightGram = (short) (reduceWeight * 1000);
        short weightLossFromToDay = 250;
        short weightLossUpToDay = 500;
//        Считаем сколько дней в крайних значениях
        byte daysOfDiet1 = (byte) (reduceWeightGram / weightLossFromToDay);
        byte daysOfDiet2 = (byte) (reduceWeightGram / weightLossUpToDay);
//        Считаем среднее
        byte averageNumberOfDays = (byte) ((daysOfDiet1 + daysOfDiet2) / 2);
        System.out.println("Что бы спортсмену похудеть на " + reduceWeight + " килограм, понадобиться:");
        System.out.println("при диете " + weightLossFromToDay + " грамм в день, всего " + daysOfDiet1 + " дней");
        System.out.println("при диете " + weightLossUpToDay + " грамм в день, всего " + daysOfDiet2 + " дней");
        System.out.println("в среднем же понадобиться " + averageNumberOfDays + " день.");

        System.out.println();
        System.out.println("                Задача №8");
//        byte countingTime = 3;
        byte increasePercentage = 10;
        int salaryPerMonthMasha = 67_760;
        int salaryPerMonthDen = 83_690;
        int salaryPerMonthKristina = 76_230;
//        Вычисляем годовой доход
        int salaryPerYearMasha = salaryPerMonthMasha * 12;
        int salaryPerYearDen = salaryPerMonthDen * 12;
        int salaryPerYearKristina = salaryPerMonthKristina * 12;
//        Вычисляем новую зарплату. Считаем в целых рублях и только за один период
        int salaryPerMonthMashaNew = salaryPerMonthMasha + ((int) (salaryPerMonthMasha / 100f * increasePercentage));
        int salaryPerMonthDenNew = salaryPerMonthDen + (int) (salaryPerMonthDen / 100f * increasePercentage);
        int salaryPerMonthKristinaNew = salaryPerMonthKristina + (int) (salaryPerMonthKristina / 100f * increasePercentage);
//        Вычисляем новый годовой доход
        int salaryPerYearMashaNew = salaryPerMonthMashaNew * 12;
        int salaryPerYearDenNew = salaryPerMonthDenNew * 12;
        int salaryPerYearKristinaNew = salaryPerMonthKristinaNew * 12;
//        Вычисляем разницу дохода в год
        int incomeDifferencePerYearMasha = salaryPerYearMashaNew - salaryPerYearMasha;
        int incomeDifferencePerYearDen = salaryPerYearDenNew - salaryPerYearDen;
        int incomeDifferencePerYearKristina = salaryPerYearKristinaNew - salaryPerYearKristina;
        System.out.println("Маша теперь получает " + salaryPerMonthMashaNew + " рублей. Годовой доход вырос на " + incomeDifferencePerYearMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryPerMonthDenNew + " рублей. Годовой доход вырос на " + incomeDifferencePerYearDen + " рублей");
        System.out.println("Кристина теперь получает " + salaryPerMonthKristinaNew + " рублей. Годовой доход вырос на " + incomeDifferencePerYearKristina + " рублей");

    }
}