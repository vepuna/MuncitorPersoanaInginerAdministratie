package org.example;

import org.example.task1.Administratie;
import org.example.task1.Inginer;
import org.example.task1.Muncitor;
import org.example.task1.Persoana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Popescu", "Ion");
        Muncitor muncitor1 = new Muncitor("Ionescu", "Vasile", "Mecanic", 2);
        Inginer inginer1 = new Inginer("Georgescu", "Marius", "Electronica", 4,"Automatizari");
        Administratie administratie1 = new Administratie("Dumitrescu", "Ana", "HR",2, "Resurse Umane");

        // Crearea și popularea listei de obiecte ale clasei copil
        List<Persoana> listaPersoane = new ArrayList<>();
        listaPersoane.add(muncitor1);
        listaPersoane.add(inginer1);
        listaPersoane.add(administratie1);

        Scanner scanner = new Scanner(System.in);
        // Dupa domeniu
        System.out.println("Introduceti domeniul pentru filtrare:");
        String domeniu = scanner.nextLine();
        List<Inginer> listaFiltrataDupaDomeniu = Persoana.filtreazaDupaDomeniu(listaPersoane, domeniu);
        System.out.println("Ingineri filtrati dupa domeniu: " + Arrays.toString(listaFiltrataDupaDomeniu.toArray()));

        // Dupa domeniu si nume, pentru Ingeneri
        System.out.println("Introduceti numele pentru filtrare Ingeneri:");
        String nume = scanner.nextLine();
        List<Inginer> listaFiltrataDupaDomeniuSiNume = Persoana.filtreazaDupaDomeniuSiNumeInginer(listaFiltrataDupaDomeniu, domeniu, nume);
        System.out.println("Ingineri filtrati dupa domeniu si nume: " + Arrays.toString(listaFiltrataDupaDomeniuSiNume.toArray()));
        System.out.println("////////////////////////////////////////////////////////////////////////");


        // Compararea dupa domeniu cu obiectul
        Inginer inginerComparat = new Inginer("Georgescu", "Marius", "Electronica",3,  "Automatizari");
        for (Persoana p : listaPersoane) {
            if (p instanceof Inginer && ((Inginer) p).getDomeniu().equals(inginerComparat.getDomeniu())) {
                System.out.println(p + " -> Coincide");
            } else {
                System.out.println(p + " -> Nu coincide");
            }
        }


    }
}