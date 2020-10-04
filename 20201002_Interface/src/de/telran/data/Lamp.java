package de.telran.data;

public class Lamp implements Stateable {

    @Override
    public void printState(int n) {
        if (n == OPEN)
            System.out.println("Light is ON");
        else if (n == CLOSED)
            System.out.println("Light is OFF");
        else
            System.out.println("Lamp is defect");
    }
}
