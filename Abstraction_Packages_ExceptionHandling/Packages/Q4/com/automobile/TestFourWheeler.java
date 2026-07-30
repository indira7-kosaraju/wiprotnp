package com.automobile;
import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;

public class TestFourWheeler {

    public static void main(String[] args) {

        Logan logan = new Logan();
        System.out.println("Logan Details");
        System.out.println("Model Name: " + logan.getModelName());
        System.out.println("Registration Number: " + logan.getRegistrationNumber());
        System.out.println("Owner Name: " + logan.getOwnerName());
        System.out.println("Speed: " + logan.speed());
        System.out.println("GPS Available: " + logan.gps());

        System.out.println();

        Ford ford = new Ford();
        System.out.println("Ford Details");
        System.out.println("Model Name: " + ford.getModelName());
        System.out.println("Registration Number: " + ford.getRegistrationNumber());
        System.out.println("Owner Name: " + ford.getOwnerName());
        System.out.println("Speed: " + ford.speed());
        System.out.println("Temp Control Available: " + ford.tempControl());
    }
}