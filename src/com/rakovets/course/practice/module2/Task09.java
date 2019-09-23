package com.rakovets.course.practice.module2;

/**
 * Разработать программу для метеологической станции:
 * которая высчитывает растояние (метров) до блишайшего места удара молнии, если известно
 *
 * @param SOUND_SPEED - скорость звука в воздушной среде
 * @param time        - время (секунд) между срабатыванием датчика света и звука
 */
public class Task09 {
	public static void main(String[] args) {
		float SOUND_SPEED = 340.29f; // скорость звука в воздушной среде 340.29 м/с

		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		int time = 8;

		// Код необходимый для тестирования, не изменять
		time = (args.length == 2) ? Integer.valueOf(args[0]) : time;

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		System.out.println(SOUND_SPEED * time);

	}
}
