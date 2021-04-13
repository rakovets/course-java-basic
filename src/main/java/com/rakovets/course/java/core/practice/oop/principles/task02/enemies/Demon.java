package com.rakovets.course.java.core.practice.oop.principles.task02.enemies;

import com.rakovets.course.java.core.practice.oop.principles.task02.heroes.Hero;

public class Demon extends Enemy {

    public Demon(int health, int attack){
        super(health,attack);
    }

    @Override
    public void getDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public void attack(Hero hero) {
        hero.getDamageFromEnemy(getAttack());
    }

}
