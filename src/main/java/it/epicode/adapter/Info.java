package it.epicode;

import java.util.Date;

public class Info {

    public Info(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    private String nome;
    public String cognome;
    public Date dataDiNascita;
    public String getNome(){

        return nome;

    }
    public void setNome(String nome){

        this.nome = nome;

    }
    public String getCognome(){

        return cognome;

    }
    public void setCognome(String cognome){

        this.cognome = cognome;

    }
    public Date getDataDiNascita(){

        return dataDiNascita;

    }

    public void DataDiNascita(Date dataDiNascita){

        this.dataDiNascita = dataDiNascita;

    }

}
