package com.company;

public class Garage<A extends  Car>implements Printable<Car.Sedan> {
    private Car.Sedan name;


    public Car.Sedan getName() {
        return name;
    }

    public void setName(Car.Sedan name) {
        this.name = name;
    }

    @Override
    public void print(Car.Sedan a) {
        System.out.println("Название машины: " + a.getClass().getSimpleName());
    }

    @Override
    public Car.Sedan print() {
        return name;
    }

   // class Toyata{}
}
