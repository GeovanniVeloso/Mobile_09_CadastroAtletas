package com.example.mobile_09_cadastroatletas.model;

public class AtletaSenior extends Atleta{

    private boolean cardiac;
    public AtletaSenior() {
        super();
    }

    public boolean isCardiac(){
        return cardiac;
    }

    public void setCardiac(Boolean cardiac){
        this.cardiac = cardiac;
    }

    @Override
    public String toString() {
        if(isCardiac() == true){
            return "Nome = "+getName()+", Data de Nascimento = "+getBirthDate()+" Bairro = "+getAddress()+
                    "É cardíaco";
        }else{
            return "Nome = "+getName()+", Data de Nascimento = "+getBirthDate()+" Bairro = "+getAddress()+
                    "Não cardíaco";
        }
    }
}
