package com.company;


public class Main {


    public static void main(String[] args) {

        SolarSystem<Earth> earthplanet = new SolarSystem<>();
        Earth earth = new Earth(3, 1999);
        earthplanet.setName(earth);
        earthplanet.print(earth);
        System.out.println("Номер планеты: " + earth.getNumber());
        System.out.println("Обьем планеты: " + earth.getVolume());


        System.out.println("------------------------");


        SolarSystem<Mercury> mercuryplanet = new SolarSystem<>();
        Mercury mercury = new Mercury(1,2000);
        mercuryplanet.setName(mercury);
        mercuryplanet.print(mercury);
        System.out.println("Номер планеты: " + mercury.getNumber());
        System.out.println("Обьем планеты: " + mercury.getVolume());


        System.out.println("------------------------");


        SolarSystem<Venus>  venusplanet = new SolarSystem<>();
        Venus venus = new Venus(2,2001);
        venusplanet.setName(venus);
        System.out.println("Номер планеты: " + venus.getNumber());
        System.out.println("Номер планеты: " + venus.getVolume());
        venusplanet.print(venus);


        System.out.println("------------------------");


        SolarSystem<Mars> marsplanets = new SolarSystem<>();
        Mars mars = new Mars(4,2001);
        marsplanets.setName(mars);
        marsplanets.print(mars);
        System.out.println("Название планеты: " + venus.getNumber());
        System.out.println("Обьем планеты: " + venus.getVolume());

    }
}
