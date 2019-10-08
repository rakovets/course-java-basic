package com.rakovets.course.practice.module4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Разработать программу для банка:
 * Необходимо расчитать прибыль, которую получит клиент по вкладу с ежегодным перерасчетом. Известно:
 *
 * @param depositAmount        сумма вклада
 * @param annualDepositPercent ежегодный процент вклада
 * @param depositTerm          продолжительность вклада (в годах)
 * @author Dmitry Rakovets
 * @version 1.0
 * @return прибыль округленную математически
 */
public class Task03 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        double depositAmount = (args.length != 3 ? scanner.nextDouble() : Double.parseDouble(args[0]));
        double annualDepositPercent = (args.length != 3 ? scanner.nextDouble() : Double.parseDouble(args[1]));
        int depositTerm = (args.length != 3 ? scanner.nextInt() : Integer.parseInt(args[2]));

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        double sumvkalda = depositAmount;

        for (int i = 0; i < depositTerm; i++) {
            sumvkalda = sumvkalda / 100 * (100 + annualDepositPercent);
        }
        NumberFormat format = new DecimalFormat("#.##");
        System.out.println(format.format(sumvkalda));
    }
}