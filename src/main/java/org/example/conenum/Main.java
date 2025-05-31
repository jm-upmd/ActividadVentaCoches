package org.example.conenum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.example.conenum.CocheCombustion.COLOR.*;

public class Main {
    public static void main(String[] args) {
        List<Coche> listaActividades = new ArrayList<>();
        listaActividades.add(new CocheCombustion("CO345", NEGRO));
        listaActividades.add(new CocheCombustion("CO234", AZUL));
        listaActividades.add(new CocheElectrico("EL123",15_000.0,0.16));
        listaActividades.add(new CocheElectrico("EL456",30_000.0,1.18));

        System.out.println("Coches ordenados por precio total:");

        Collections.sort(listaActividades);
       imprimeLista(listaActividades);

        System.out.println("\nnCoches ordenadas por descripción:");
        listaActividades.sort(new ComparadorDescripcion());
        imprimeLista(listaActividades);


    }

    static void imprimeLista(List<Coche> l) {
        for(Coche c: l){
            System.out.println(c.toString());
            System.out.println();
        }
    }

}