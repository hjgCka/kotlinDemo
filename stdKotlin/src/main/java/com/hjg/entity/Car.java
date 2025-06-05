package com.hjg.entity;

/**
 * @Description
 * @Author hjg
 * @Date 2025-06-06 1:19
 */
public class Car {
    private String brand;
    private String name;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Zeeker");
        car.setName("Ford");
        System.out.println(car.getBrand() + " " + car.getName());
    }
}
