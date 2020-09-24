package de.telran.application;

import de.telran.data.Adress;
import de.telran.data.Person;

public class PersonApp {
    public static void main(String[] args) {
        Adress adress1 = new Adress("Москва", "ул. Суворова", 25);


        Person person1 = new Person("Вася", 25, 1.75, adress1);
        Person person2 = new Person("Петя", 38, 1.72, new Adress("Москва", "ул. Ленина", 50));
        Person person3 = new Person("Лена", 35, 1.60, new Adress("Екатеренбург", "ул. 25 Октября", 48));
        Person person4 = new Person("Оля", 36, 1.62, new Adress("Воронеж", "пер. Труда", 26 / 2));
        Person person5 = new Person("Макс", 30, 1.80, new Adress("Воронеж", "пер. Труда", 26 / 2));



        Person[] group = {person1, person2, person3, person4, person5};

        System.out.println("Персона 1: ");
        System.out.println(person1);
        System.out.println();
        System.out.println("Персона 2: ");
        System.out.println(person2);
        System.out.println();
        System.out.println("Персона 1 с изменённым именем: ");
        person1.setName("Лёша");
        System.out.println(person1);
        System.out.println();
        System.out.println("Группа людей (НОРМ): ");
        Person.displayOutPerson(group);
        System.out.println();
        System.out.println("Сортировка по возрасту: ");
        Person.sortPersonByAge2(group);
        Person.displayOutPerson(group);
        System.out.println();
        System.out.println("Сортировка по росту:");
        Person.sortPersonByHeight(group);
        Person.displayOutPerson(group);
        System.out.println();
        System.out.println("Сортировка по имени: ");
        Person.sortPersonByName(group);
        Person.displayOutPerson(group);
        System.out.println();

        System.out.println(Person.findPersonByAdress(group, adress1));
        //Person.displayOutPerson(group);
    }

}
