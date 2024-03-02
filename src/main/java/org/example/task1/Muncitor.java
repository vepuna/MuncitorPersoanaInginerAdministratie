package org.example.task1;

import java.util.List;
import java.util.stream.Collectors;

public class Muncitor extends Persoana {
    private String sectie;
    private Integer stagiuDeMunca;

    public Muncitor() {
        super();
        this.sectie = "Sectia muncitorului nu este introdusa";
        this.stagiuDeMunca = 0;
    }

    public Muncitor(String nume, String prenume, String sectie, Integer stagiuDeMunca) {
        super(nume, prenume);
        this.sectie = sectie;
        this.stagiuDeMunca = stagiuDeMunca;
    }

    // Getter și Setter
    public String getSectie() {
        return sectie;
    }

    public void setSectie(String sectie) {
        this.sectie = sectie;
    }

    public Integer getStagiuDeMunca() {
        return stagiuDeMunca;
    }

    public void setStagiuDeMunca(Integer stagiuDeMunca) {
        this.stagiuDeMunca = stagiuDeMunca;
    }

    @Override
    public String toString() {
        return "Muncitor{" +
                "nume=" + getNume() +
                ", prenume=" + getPrenume() +
                ", sectie='" + sectie + '\'' +
                ", stagiuDeMunca=" + stagiuDeMunca +
                '}';
    }
}
