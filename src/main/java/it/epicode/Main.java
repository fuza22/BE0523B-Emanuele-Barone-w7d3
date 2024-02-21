package it.epicode;

import it.epicode.adapter.Adapter;
import it.epicode.adapter.Info;
import it.epicode.adapter.UserData;
import it.epicode.chain.Capitano;
import it.epicode.chain.Maggiore;
import it.epicode.chain.Tenente;
import it.epicode.composite.Libro;
import it.epicode.composite.Pagina;
import it.epicode.composite.Sezione;

import java.util.GregorianCalendar;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ESERCIZIO 1

        Info info = new Info(new GregorianCalendar(1996, GregorianCalendar.MAY,22).getTime());

        info.setNome("Emanuele");
        info.setCognome("Barone");

        UserData userData = new UserData();
        Adapter adapter = new Adapter(info);
        userData.getData(adapter);

        System.out.println("Nome completo: " + userData.nomeCompleto);
        System.out.println("Età: " + userData.eta);



        // ESERCIZIO 2


        Pagina p1 = new Pagina();
        Pagina p2 = new Pagina();
        Pagina p3 = new Pagina();
        Pagina p4 = new Pagina();
        Pagina p5 = new Pagina();
        Pagina p6 = new Pagina();
        Pagina p7 = new Pagina();

        Sezione sottoSezione1 = new Sezione(List.of(p1,p2));
        Sezione sottoSezione2 = new Sezione(List.of(p3,p4));
        Sezione sottoSezione3 = new Sezione(List.of(p5,p6));

        Sezione sezione1 = new Sezione(List.of(sottoSezione1, sottoSezione2));
        Sezione sezione2 = new Sezione(List.of(sottoSezione3, p7));

        Libro l1 = new Libro("Libro", List.of("Carli", "Pippo"), List.of(sezione1, sezione2));

        System.out.println(l1.getNumeroPagine());


        // ESERCIZIO 3

        Maggiore maggiore = new Maggiore("Maggiore", null, 3000);
        Capitano capitano = new Capitano("Capitano",maggiore, 2000);
        Tenente tenente = new Tenente("Tenente", capitano, 1000);

        tenente.confrontaStipendi(1500);

    }
}