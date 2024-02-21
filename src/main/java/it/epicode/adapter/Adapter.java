package it.epicode.adapter;


import java.util.Date;

public class Adapter implements DataSource {

    private Info info;


    public Adapter(Info info) {
        this.info = info;
    }


    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {

        Date dataDiNascita = info.getDataDiNascita();
        Date oggi = new Date(System.currentTimeMillis());
        long diffInMillies = Math.abs(oggi.getTime() - dataDiNascita.getTime());
        long differenzaData = diffInMillies / (24 * 60 * 60 * 1000); // la moltiplicazione è la giornata in millisecondi
        int eta = (int) (differenzaData / 365);
        return eta;

    }


}
