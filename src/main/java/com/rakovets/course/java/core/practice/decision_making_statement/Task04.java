package com.rakovets.course.java.core.practice.decision_making_statement;

/**
 * Разработать программу для desktop приложения:
 * которая преобразует номер дня недели в его словесный аналог.
 *
 * @author Dmitry Rakovets
 */
class Task04 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        byte dayOfWeekNumber = 1;

        String nameWeekday = getDayOfWeekNumber(dayOfWeekNumber);
        System.out.printf("Result: %s", nameWeekday);
    }

    /**
     * Возвращает название дня недели, в зависимости от его порядкового номера.
     *
     * @param dayOfWeekNumber номер дня недели
     * @return день недели на английском языке (UPPER CASE)
     */
    static String getDayOfWeekNumber(byte dayOfWeekNumber) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String result = null;
        switch (dayOfWeekNumber){
            case 1:
                result = "MONDAY";
                break;
            case 2:
                result = "TUESDAY";
                break;
            case 3:
                result = "WEDNESDAY";
                break;
            case 4:
                result = "THURSDAY";
                break;
            case 5:
                result = "FRIDAY";
                break;
            case 6:
                result = "SATURDAY";
                break;
            case 7:
                result = "SUNDAY";
                break;
        }
        return result;
    }
}
