package Opgave_1_10;

/*
Et stykke kode der udregner gennemsnits hastigheden fra kmt til mph ud fra den givne tid
 */
public class MyClass {
    public static void main(String[] args) {
        double miles = 14/1.6;
        double minute = 40*60;
        double second = 300;
        double time;
        double mph;

        time = (minute + second) / 3600;
        mph = miles/time;

        System.out.println("Gennemsnits hastigheden er " + mph +" mph");
    }
}
