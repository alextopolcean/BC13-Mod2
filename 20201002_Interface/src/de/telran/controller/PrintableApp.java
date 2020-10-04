package de.telran.controller;

import de.telran.data.*;

public class PrintableApp {

    public static void main(String[] args) {

        Book book = new Book("The little prince", "Saint-Exseupery");
        Printable book2 = new Book("War und Peace", "Lev Tolstoy");
        Printable journal = new Journal("Welt");
        Printable newpaper = new Newspaper("Bild");
        WaterPipe pipe = new WaterPipe();

        Lamp lamp = new Lamp();
        lamp.printState(0);
        pipe.printState(1);

        Printable[] printableObjects = {book, book2, journal, newpaper, pipe};

        for (Printable p : printableObjects) {
            p.print();
        }

        book.print2("i'm book");
        newpaper.print2("Morgen Post");

        Printable.print1();
        //Printable.createObject("Peace", 2);
        Printable p = Printable.createObject("Peace", 2);
        p.print();

        
    }

}
