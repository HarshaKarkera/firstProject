package com.company.oops.interfaces;

public class Main
{
    public static void main(String[] args) {
        Car car =new Car();
        car.acc();
        car.brake();
        car.start();
        car.stop();

        NiceCar carr=new NiceCar();
        carr.start();
        carr.startMusic();
        carr.upgradeEngine();
        carr.start();
    }
}
