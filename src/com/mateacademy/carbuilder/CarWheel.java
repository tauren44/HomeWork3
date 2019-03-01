package com.mateacademy.carbuilder;

public class CarWheel {
    private double wheelCondition;

    public CarWheel() {
        wheelCondition = 0.5;
    }

    public CarWheel(double wheelCondition) {
        this.wheelCondition = wheelCondition;
    }

    public double getWheelCondition() {
        return wheelCondition;
    }

    public void setWheelCondition(double wheelCondition) {
        this.wheelCondition = wheelCondition;
    }

    public void switchWheel() {
        wheelCondition = 1;
    }

    public void damageWheel(double percent) {
        wheelCondition = wheelCondition - (percent / 100);
    }

    public void printWheelCondition() {
        System.out.println("Wheel is damaged for " + (100 - wheelCondition * 100) + " percents");
    }
}