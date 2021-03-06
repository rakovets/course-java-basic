package com.rakovets.course.java.core.example.generic_types.truck.before;

import com.rakovets.course.java.core.example.generic_types.truck.model.Laptop;
import com.rakovets.course.java.core.example.generic_types.truck.model.Potato;

public class DemoFactory {
    public static void main(String[] args) {
        Truck truckWithLaptop = new Truck();
        Box[] boxes = new Box[5];
        boxes[0] = new Box(new Laptop("ASUS"));
        boxes[1] = new Box(new Laptop("ASUS"));
        boxes[2] = new Box(new Laptop("ASUS"));
        boxes[3] = new Box(new Laptop("ASUS"));
        boxes[4] = new Box(new Potato("Pallessie")); // upload WRONG box

        new LoadingPlace().uploadCargo(truckWithLaptop, boxes);

        new UnloadingPlace().unload(truckWithLaptop); // have runtime error: java.lang.ClassCastException
    }
}
