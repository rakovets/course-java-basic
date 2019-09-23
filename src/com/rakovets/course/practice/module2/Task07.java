package com.rakovets.course.practice.module2;

/**
 * Написать программу для фабрики по производству зонтов:
 * которая расчитает площадь материала небходимого для изготовления одного зонта. Для изготовления
 * зонта используется материал в форме круга. Известено:
 *
 * @param diameter - диаметр зонта, который необходимо изготовить
 */
public class Task07 {
	public static void main(String[] args) {
		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		int diameter = 4;

		// Код необходимый для тестирования, не изменять
		diameter = (args.length == 1) ? Integer.valueOf(args[0]) : diameter;

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int radius = diameter / 2;
		double squardRad = Math.pow(radius, 2);
     System.out.println(Math.PI * squardRad);

	}
}