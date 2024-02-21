package it.epicode;


public class UserData {

    public String nomeCompleto;
    public int eta;
    public void getData(DataSource ds){

        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();

    }

}
