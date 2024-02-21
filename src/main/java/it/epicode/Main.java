package it.epicode;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        Info info = new Info(new GregorianCalendar(1996, GregorianCalendar.MAY,22).getTime());

        info.setNome("Emanuele");
        info.setCognome("Barone");

        UserData userData = new UserData();
        Adapter adapter = new Adapter(info);
        userData.getData(adapter);

        System.out.println("Nome completo: " + userData.nomeCompleto);
        System.out.println("Età: " + userData.eta);

    }
}