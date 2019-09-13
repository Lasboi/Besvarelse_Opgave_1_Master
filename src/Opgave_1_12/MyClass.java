package Opgave_1_12;

public class MyClass {
    public static void main(String[] args) {
        double km = 24.0*1.6; //Udregning af hvor mange km der er løbet fra miles
        double hour = 1; //Antal timer
        double minute = 40*60; //Udregning af antal minutter
        double second = 35.0; //Antal sekunder
        double time; //Tid der er brugt i alt
        double kmh; //Km i timen

        time = hour + (minute+second) /3600; //Udregning af tiden quick math
        kmh = km/time; //Udregning af distance/tid for at finde gennemsnittet

        System.out.println("Gennemsnits hastigheden er " + kmh + " km/t"); //Consol kommando til at skrive hastigheden

    }
}
