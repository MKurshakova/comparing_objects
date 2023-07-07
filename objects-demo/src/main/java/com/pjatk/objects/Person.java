package com.pjatk.objects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private ArrayList<Address> addresses = new ArrayList<Address>();

    public Person(int number, String name, LocalDate birthday) {
        this.id = number;
        this.name = name;
        this.dateOfBirth = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public Person copy() {
        Person p = new Person(this.id, this.name, this.dateOfBirth);
        p.addresses = new ArrayList<>(addresses);
        return p;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name) &&
                Objects.equals(dateOfBirth, person.dateOfBirth) &&
                Objects.equals(addresses, person.addresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateOfBirth, addresses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(id).append(", ").append(name).append(", ").append(dateOfBirth).append(")\n");
        sb.append("Adresy:\n");
        for (Address address : addresses) {
            sb.append(address).append("\n");
        }
        return sb.toString();
    }
}
