package org.example.conenum;

import java.util.Comparator;

public class ComparadorDescripcion implements Comparator<Coche> {
    @Override
    public int compare(Coche o1, Coche o2) {
        return o1.getIdentificador().compareTo(o2.getIdentificador());
    }
}
