package de.telran.data;

public class Newspaper implements Printable {
    private String name;

    public Newspaper() {
    }

    public Newspaper(String title) {
        this.name = title;
    }

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public void print2(String str) {
        System.out.println("Newspaper " + str);

    }
}
