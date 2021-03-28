package com.rakovets.course.java.core.practice.decision_making_statement;

/**
 * Разработать программу для игрового движка.
 * <p>
 * Два игрока играют в “Battle City” (танчики времен приставок “SEGA” и “Dendy”). После каждого боя им, в зависимости
 * от количества уничтоженных танков, начисляются очки:
 * <ul>
 *  <li>Тому, кто уничтожил больше танков начисляется дополнительные 500 очков.</li>
 *  <li>В случае когда уничтожено одинаковое количество танков, бонусные очки не начисляются никому.</li>
 *  <li>За 1 танк начисляется 100 очков.</li>
 * </ul>
 */
class Task06 {
    private static final int BONUS_POINT = 500;
    private static final int KILL_POINT = 100;

    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int tanksKilledFirstPlayer = 2;
        int tanksKilledSecondPlayer = 4;

        String result = getResult(tanksKilledFirstPlayer, tanksKilledSecondPlayer);
        System.out.println(result);
    }

    /**
     * Высчитывает результаты боя.
     *
     * @param tanksKilledFirstPlayer  количество танков, убитых первым игроком
     * @param tanksKilledSecondPlayer количество танков, убитых вторым игроком
     * @return 'Player 1: ${0}. Player 2: ${1}', где ${0} - очки первого игрока, ${1} - очки второго игрока.
     */
    static String getResult(int tanksKilledFirstPlayer, int tanksKilledSecondPlayer) {
        int pointPlayer1 = tanksKilledFirstPlayer * KILL_POINT;
        int pointPlayer2 = tanksKilledSecondPlayer * KILL_POINT;
        int resultPlayer1 = pointPlayer1 + BONUS_POINT;
        int resultPlayer2 = pointPlayer2 + BONUS_POINT;

        if (tanksKilledFirstPlayer > tanksKilledSecondPlayer) {
            return "Player 1: " + resultPlayer1 + ". Player 2: " + pointPlayer2;
        } else if (tanksKilledFirstPlayer < tanksKilledSecondPlayer) {
            return "Player 1: " + pointPlayer1 + ". Player 2: " + resultPlayer2;
        } else if (tanksKilledFirstPlayer == tanksKilledSecondPlayer) {
            return "Player 1: " + pointPlayer1 + ". Player 2: " + pointPlayer2;
        } else {
            return null;
        }
    }
}