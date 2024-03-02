package org.example.task1;

import java.util.List;
import java.util.stream.Collectors;
public class Inginer extends Muncitor {
    private String domeniu;

    // Constructor fără parametri
    public Inginer() {
        super();
        this.domeniu = "Domeniu inginer nu este introdus";
    }

    // Constructor cu parametri
    public Inginer(String nume, String prenume, String sectie,Integer stagiuDeMunca, String domeniu) {
        super(nume, prenume, sectie, stagiuDeMunca);
        this.domeniu = domeniu;
    }

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    @Override
    public String toString() {
        return super.toString() + ", Domeniu='" + domeniu + '\'';
    }









}
