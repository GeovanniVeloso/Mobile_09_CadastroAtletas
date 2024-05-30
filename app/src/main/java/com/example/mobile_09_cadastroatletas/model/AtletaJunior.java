package com.example.mobile_09_cadastroatletas.model;

public class AtletaJunior extends Atleta{

    private int competitionAge;
    public AtletaJunior() {
        super();
    }

    public int getCompetitionAge() {
        return competitionAge;
    }

    public void setCompetitionAge(int competitionAge) {
        this.competitionAge = competitionAge;
    }

    @Override
    public String toString() {
        return "Nome = "+getName()+", Data de Nascimento = "+getBirthDate()+" Bairro = "+getAddress()+
                "Anos competindo = " + competitionAge;
    }
}
