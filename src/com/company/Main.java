package com.company;

public class Main {


    public static void main(String[] args) {

        Garage<Car> sedanGarage = new Garage<>();
        Car.Sedan Sedan = new Car.Sedan();
        sedanGarage.setName(Sedan);
        System.out.println(sedanGarage.print());
        sedanGarage.print(Sedan);
    }




}
