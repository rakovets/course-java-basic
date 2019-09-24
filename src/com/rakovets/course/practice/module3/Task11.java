package com.rakovets.course.practice.module3;

import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Разработать программу для desktop приложения:
 * Необходимо определить, какие символы вводит пользователь:
 * - латиници
 * - кирилица
 * - цифра
 * - спец. символ
 * Так же программа не должна зависеть от регистра.
 * Известно:
 *
 * @param letter - символ введенный пользователем
 * @return 'latin'/'cyrillic'/'digit'/'undefined'
 * <p>
 * Help: American standard code for information interchange
 */

public class Task11 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        char letter = (args.length != 1) ? scanner.next().charAt(0) : args[0].charAt(0);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        String type = "";
        String letterString = String.valueOf(letter);

        if (letterString.matches("[0-9]"))
            type = "digit";
        else if (letterString.matches("\\w"))
            type = "latin";
        else if (letterString.matches("[а-яА-Я]"))
            type = "cyrillic";
        else
            type = "undefined";

        System.out.println(type);
    }
}