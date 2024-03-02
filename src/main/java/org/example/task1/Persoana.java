package org.example.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Persoana {
    private String nume;
    private String prenume;

    // Constructor fără parametri
    public Persoana() {
        this.nume = "Nume nu este introdusa";
        this.prenume = "Prenume nu este introdusa";
    }

    // Constructor cu parametri
    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    // Metode get și set
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                '}';
    }


    //filtrare dupa Domeniu, pentru Ingineri
    public static List<Inginer> filtreazaDupaDomeniu(List<Persoana> persoane, String domeniu) {
        List<Inginer> listaFiltrata = new ArrayList<>();
        for (Persoana persoana : persoane) {
            if (persoana instanceof Inginer && ((Inginer) persoana).getDomeniu().equals(domeniu)) {
                listaFiltrata.add((Inginer) persoana);
            }
        }
        return listaFiltrata;
    }

    // filtrarea dupaDomeniuSiNume pentru Ingineri
    public static List<Inginer> filtreazaDupaDomeniuSiNumeInginer(List<Inginer> lista, String domeniu, String nume) {
        return lista.stream()
                .filter(inginer -> inginer.getDomeniu().equalsIgnoreCase(domeniu) && inginer.getNume().equalsIgnoreCase(nume))
                .collect(Collectors.toList());
    }
}
