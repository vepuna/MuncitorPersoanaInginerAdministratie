package org.example.task1;

import java.util.List;
import java.util.stream.Collectors;
public class Administratie extends Muncitor {
    private String departament;

    // Constructor fără parametru
    public Administratie() {
        super();
        this.departament = "Departamentul nu este introdus";
    }

    // Constructor cu parametru
    public Administratie(String nume, String prenume, String sectie,Integer stagiuDeMunca, String departament) {
        super(nume, prenume, sectie, stagiuDeMunca);
        this.departament = departament;
    }

   // Getter and Setter
    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return super.toString() + ", departament='" + departament + '\'';
    }

}

