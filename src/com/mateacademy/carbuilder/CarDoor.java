package com.mateacademy.carbuilder;

public class CarDoor {
    private boolean doorIsOpened;
    private boolean windowIsOpened;

    public CarDoor() {

    }

    public CarDoor(boolean doorIsOpened, boolean windowIsOpened) {
        this.doorIsOpened = doorIsOpened;
        this.windowIsOpened = windowIsOpened;
    }

    public void openDoor() {
        this.doorIsOpened = true;
    }

    public void closeDoor() {
        this.doorIsOpened = false;
    }

    public void switchDoor() {
        this.doorIsOpened = !doorIsOpened;
    }

    public void openWindow() {
        this.windowIsOpened = true;
    }

    public void closeWindow() {
        this.windowIsOpened = false;
    }

    public void switchWindow() {
        this.windowIsOpened = !windowIsOpened;
    }

    public boolean isDoorOpened() {
        return doorIsOpened;
    }

    public boolean isWindowOpened() {
        return windowIsOpened;
    }

    public void printCarDoorState() {
        System.out.println("The door now is " + (isDoorOpened() ? "opened" : "closed")
                + " and window now is " + (isWindowOpened() ? "opened" : "closed"));
    }
}
