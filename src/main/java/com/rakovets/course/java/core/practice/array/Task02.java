package com.rakovets.course.java.core.practice.array;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Разработать программу для электронного дневника, которая работает с отметками по всем предметам.
 *
 * @author Dmitry Rakovets
 */
class Task02 {
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int[][] marks = {
                {6, 4, 7},
                {0, 1, 2},
                {1, 4, 4},
        };

        double averageMark = getAverageMark(marks);
        System.out.printf("Average mark: %f\n", averageMark);
        int minMark = getMinMark(marks);
        System.out.printf("Min mark: %d\n", minMark);
        int maxMark = getMaxMark(marks);
        System.out.printf("Max mark: %d\n", maxMark);
    }

    /**
     * Возвращает средне арифметическую отметку за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[][] marks) {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                sum += marks[i][j];
            }
        }
        return BigDecimal.valueOf(sum /= marks.length * marks[0].length)
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * Возвращает минимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[][] marks) {
        int minValue = marks[0][0];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                if (minValue > marks[i][j]){
                    minValue = marks[i][j];
                }
            }
        }
        return minValue;
    }

    /**
     * Возвращает максимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[][] marks) {
        int maxValue = marks[0][0];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                if (maxValue < marks[i][j]){
                    maxValue = marks[i][j];
                }
            }
        }
        return maxValue;
    }
}
