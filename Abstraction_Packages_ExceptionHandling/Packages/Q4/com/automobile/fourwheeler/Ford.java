package com.automobile.fourwheeler;
import com.automobile.Vehicle;

public class Ford extends Vehicle {

    public String getModelName() {
        return "Ford";
    }

    public String getRegistrationNumber() {
        return "AP39F5678";
    }

    public String getOwnerName() {
        return "Kiran";
    }

    public int speed() {
        return 120;
    }

    public int tempControl() {
        return 1;
    }
}