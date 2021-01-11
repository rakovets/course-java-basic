package com.rakovets.course.javabasics.practice.loops;

/**
 * Разработать программу для табличного процессора.
 * .
 *
 * @author Dmitry Rakovets
 */
class Task01 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int rows = 5;

        String numbersColumn = generateNumbersColumn(rows);
        System.out.printf("Result:\n%s", numbersColumn);
    }

    /**
     * Генерирует текст, который содержит столбец с номерами строк.
     *
     * @param numberRows количество строк в таблице
     * @return текст, который содержит столбец с номерами строк, где каждый номер на новой строке
     */
    static String generateNumbersColumn(int numberRows) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String allRows = "";
        for (int i = 1; i < numberRows; i++) {
            allRows = allRows + i + "\n";
        }
        return allRows + numberRows;
    }
}
