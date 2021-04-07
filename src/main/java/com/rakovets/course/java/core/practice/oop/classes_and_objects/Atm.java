package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;
    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }
    public int addBanknotes20(int quantity) {
        return numberBanknotes20 += quantity;
    }
    public int addBanknotes50(int quantity) {
        return numberBanknotes50 += quantity;
    }
    public int addBanknotes100(int quantity) {
        return numberBanknotes100 += quantity;
    }
    public int getNumberBanknotes20() {
        return numberBanknotes20;
    }
    public int getNumberBanknotes50() {
        return numberBanknotes50;
    }
    public int getNumberBanknotes100() {
        return numberBanknotes100;
    }
}
