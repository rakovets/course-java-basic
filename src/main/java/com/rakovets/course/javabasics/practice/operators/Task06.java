package com.rakovets.course.javabasics.practice.operators;

/**
 * Разработать программу для игрового движка:
 * которая высчитывает сколько времени пользователь провел в игре, если известно
 *
 * @param playingTimeInSeconds - количество секунд проведенных пользователем в игре
 * @return время в формате 'D H:m:s', где D - дни, H - часы, m - минуты, s - секунды
 */
public class Task06 {
    public static void main(String[] args) {
        //FIXME
        // Переменные, которые можно изменять для проверки различных вариантов входных параметров
        int playingTimeInSeconds = 914701;

        // Код необходимый для тестирования, не изменять
        playingTimeInSeconds = (args.length == 1) ? Integer.parseInt(args[0]) : playingTimeInSeconds;

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        int playingTimeInDay = playingTimeInSeconds / 86400;
        int playingTimeInHoursInSecond = playingTimeInSeconds % 86400;
        int playingTimeInHours = (playingTimeInHoursInSecond / 3600 );
        int playingTimeInMinutesInSecond = playingTimeInHoursInSecond % 3600;
        int playingTimeInMinutes = playingTimeInMinutesInSecond /60 ;
        int playingTimeInFinalSecond = playingTimeInMinutesInSecond % 60;
        System.out.printf("%d %d:%d:%d", playingTimeInDay, playingTimeInHours, playingTimeInMinutes, playingTimeInFinalSecond );
    }
}
