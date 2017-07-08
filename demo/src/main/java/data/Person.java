package data;

public class Person {
    String name;
    String surname;
    Float weight;

    public Person(String name, String surname, Float weight) {
        this.name = name;
        this.surname = surname;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
}