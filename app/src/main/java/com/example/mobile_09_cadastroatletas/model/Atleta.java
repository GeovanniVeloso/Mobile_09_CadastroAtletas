package com.example.mobile_09_cadastroatletas.model;

public abstract class Atleta {

    private String name;
    private String birthDate;
    private String address;

    public Atleta() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
