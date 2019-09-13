package Opgave_1_11;

/*
Et dejligt stykke kode som udregner det antal folk som vil være i landet de næste 5 år
Der køre et while loop som der vil udregne mængden af folk i alt 5 gange og skrive tallet til konsollen
 */
public class MyClass {
    public static void main(String[] args) {
        int day = 31536000;
        int births = 7;
        int deaths = 13;
        int immigrant = 45;
        int years = 0;
        int population = 312032486;

        while (years != 5){
            population = (day / births) + population;
            population = population - (day / deaths);
            population = (day / immigrant) + population;
            years++;
            System.out.println(population);
        }

    }
}
