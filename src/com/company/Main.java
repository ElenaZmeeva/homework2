package com.company;

public class Main {

    public static void main(String[] args) {
	// task 1
        byte tree = 6;
        short flower = 10;
        int bush = 8;
        long forest = 1L;
        float riceWeight = 1.25f;
        double coffeeWeight = 3.456;
        boolean treeIsEnough = tree >5;
        char bar = 64;

        // task 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double bothBoxer = boxer1 + boxer2;
        double differenceWeight = boxer2 - boxer1;
        System.out.println ("общий вес боксеров "  + bothBoxer + " кг");
        System.out.println ("разница в весе боксеров "+ differenceWeight + " кг");
// task 3
int weightBanana = 80;
int volumeMilk = 105;
int icecream = 100;
int eggWeight = 70;
int allBananas = weightBanana * 5;
int milk = volumeMilk * 2 ;
int allIcecream = icecream * 2;
int allEggs = eggWeight * 4;
int gramm = allBananas + milk + allIcecream + allEggs;
System.out.println( " завтрак в граммах " + gramm + " гр ");
float gr = 1090f;
float kg = gr / 1000;
System.out.println( " завтрак в килограммах " + kg + " кг ");

//task 4
int extraKg =7;
int extraGr = extraKg * 1000;
System.out.println( " похудение в граммах" + extraGr + " гр ");
int loss1 = 250;
int loss2 = 500;
int days1Way = extraGr /loss1;
System.out.println( " количество дней на похудение по 250 гр " + days1Way);
int days2Way = extraGr / loss2;
System.out.println( " количество дней на похудение по 500 гр " + days2Way);
int average = (days1Way + days2Way) / 2;
System.out.println( " среднее количество дней " + average + " день" );

//task 5
int salaryMary =67760;
int salaryDen = 83690;
int salaryKris = 76230;
int newSalaryMary = salaryMary + 6776;
System.out.println( " новая зарплата Маши " + newSalaryMary + " рублей ");
int newSalaryDen = salaryDen + 8369;
System.out.println( " новая зарплата Дениса " + newSalaryDen + " рублей");
int newSalaryKris = salaryKris + 7623;
System.out.println( " новая зарплата Кристины " + newSalaryKris + " рублей ");
int allSalaryMary = salaryMary * 12;
int newAllSalaryMary = newSalaryMary * 12;
int differenceMary = newAllSalaryMary - allSalaryMary;
System.out.println( " разница между годовым доходом Маши " + differenceMary + " руб");
int allSalaryDen = salaryDen * 12;
int newAllSalaryDen = newSalaryDen * 12;
int differenceDen = newAllSalaryDen - allSalaryDen;
System.out.println( " разница между годовым доходом Дениса " + differenceDen + " руб");
int allSalaryKris = salaryKris * 12;
int newAllSalaryKris = newSalaryKris * 12;
int differenceKris = newAllSalaryKris - allSalaryKris;
System.out.println( " разница между годовым доходом Кристины " + differenceKris + " руб");
    }
}