package fr.diginamic.operations;

public class Operations {

    public static double calcul(double a, double b, char c) {

        double total = 0;
        switch (c) {
            case '+' : total = a + b;
                break;
            case '-' : total = a - b;
                break;
            case '*' : total = a * b;
                break;
            case '/' : total = a / b;
            break;
        }
        return total;
    }

}
