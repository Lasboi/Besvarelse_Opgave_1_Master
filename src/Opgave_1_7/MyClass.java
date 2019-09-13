package Opgave_1_7;

public class MyClass {
    public static void main(String[] args) {
        double sum1 = 4*(1.0-13+(15-17+(19-111))); //Udregner den første sum
        double sum2 = 4*(1.0-13+(15-17+(19-111))); //Udregner den anden sum

        sum2 = sum2+113; //Ligger 113 til den anden sum

        System.out.println(sum1); //Skriver den første sum ud til konsollen
        System.out.println(sum2); //Skriver den anden sum ud til konsollen
    }
}
