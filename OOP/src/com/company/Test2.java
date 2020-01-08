package com.company;

import s.Car;

public class Test2 {
    public static void main(String[] args) {
        final Car car = new Car();
        car.setPrice(99);
//        car = new Car();
        System.out.println(car.getPrice());
    }
}
