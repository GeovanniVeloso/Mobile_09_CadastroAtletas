package com.example.mobile_09_cadastroatletas.model;

public class AtletaPleno extends Atleta{

    private String gym;
    private double record;

    public AtletaPleno() {
        super();
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public double getRecord() {
        return record;
    }

    public void setRecord(double record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "Nome = "+getName()+", Data de Nascimento = "+getBirthDate()+" Bairro = "+getAddress()+
                "Academia = "+gym+" Recorde = "+record+" segundos";
    }
}
