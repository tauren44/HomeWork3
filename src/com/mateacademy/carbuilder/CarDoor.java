package com.mateacademy.carbuilder;

public class CarDoor {
    private boolean doorIsOpened;
    private boolean windowIsOpened;

    public CarDoor() {
        doorIsOpened = false;
        windowIsOpened = false;
    }

    public CarDoor(boolean doorIsOpened, boolean windowIsOpened) {
        this.doorIsOpened = doorIsOpened;
        this.windowIsOpened = windowIsOpened;
    }

    public void openDoor() {
        if (!doorIsOpened) {
            setDoorIsOpened(true);
        }
    }

    public void closeDoor() {
        if (doorIsOpened) {
            setDoorIsOpened(false);
        }
    }

    public void switchDoor() {
        setDoorIsOpened(!doorIsOpened);
    }

    public void openWindow() {
        if (!windowIsOpened) {
            setWindowIsOpened(true);
        }
    }

    public void closeWindow() {
        if (windowIsOpened) {
            setWindowIsOpened(false);
        }
    }

    public void switchWindow() {
        setWindowIsOpened(!windowIsOpened);
    }

    public boolean isDoorOpened() {
        return doorIsOpened;
    }

    public void setDoorIsOpened(boolean doorIsOpened) {
        this.doorIsOpened = doorIsOpened;
    }

    public boolean isWindowOpened() {
        return windowIsOpened;
    }

    public void setWindowIsOpened(boolean windowIsOpened) {
        this.windowIsOpened = windowIsOpened;
    }

    public void printCarDoorState() {
        System.out.println("The door now is " + (isDoorOpened() ? "opened" : "closed")
                + " and window now is " + (isWindowOpened() ? "opened" : "closed"));
    }
}