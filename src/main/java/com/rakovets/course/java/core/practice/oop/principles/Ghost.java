package com.rakovets.course.java.core.practice.oop.principles;

public class Ghost extends Enemy {
    public Ghost(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Враг атакует героя");
        if (!(hero instanceof Mag)) {
            hero.takeDamageHero(15);
        }
    }
}
