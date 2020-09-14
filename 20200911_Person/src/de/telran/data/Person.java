package de.telran.data;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110)
            this.age = age;
        else
            System.out.println("указан неверный возраст");
    }

    @Override
    public String toString() {
        return
                "Имя:" + " " + name +
                        ", Возраст:" + " " + age +
                        ", Рост:" + " " + height;
    }

    public static void displayOutPerson(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    public static Person getOldestPerson(Person[] persons) {
        Person oldestPerson = persons[0];
        for (int i = 1; i < persons.length; i++) {
            if (persons[i].age > oldestPerson.age) {
                oldestPerson = persons[i];
            }
            return oldestPerson;
        }


        return null;
    }

    public static void getOldestPerson2(Person[] persons) {


    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    private static int comparePersonByAge(Person p1, Person p2) {
        if (p1.age > p2.age) {
            return 1;
        } else if (p1.age < p2.age) {
            return -1;

        }
        return 0;
    }

    public static void sortPersonByAge(Person[] persons) {
        for (int i = 0; i < (persons.length - 1) - i; i++) {
            for (int j = 0; i < persons.length - 1; j++) {
                if (comparePersonByAge(persons[j], persons[j + 1]) < 0) {
                    Person temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;

                }

            }

        }
    }

    private int compareToPersonByAge(Person person) {
        if (this.age > person.age) {
            return 1;
        } else if (this.age < person.age) {
            return -1;
        }
        return 0;
    }

    public static void sortPersonByAge2(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < (persons.length - 1) - i; j++) {
                if (persons[j].compareToPersonByAge(persons[j + 1]) > 0) {
                    Person temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }

            }

        }
    }

    public static void sortPersonByName(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < (persons.length - 1) - i; j++) {
                if (persons[j].name.compareTo(persons[j + 1].name) > 0) {
                    Person temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }

            }

        }
    }
    
    private double compareToPersonByHeight(Person persons) {
        if (this.height > persons.height)
            return 1;
        else if (this.height < persons.height)
            return -1;
        return 0.0;
    }

    public static void sortPersonByHeight(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < (persons.length - 1) - i; j++) {
                if (persons[j].compareToPersonByHeight(persons[j + 1]) > 0) {
                    Person temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }
}
