package org.example.conenum;

import java.util.HashMap;

import static org.example.conenum.CocheCombustion.COLOR.*;

public class CocheCombustion extends Coche{
    enum COLOR {BLANCO,AZUL,NEGRO,GRIS}
    private static final double PRECIO_BASE = 20_000.0;
    private final COLOR color;
    private static  HashMap<COLOR,Double> listaCostesExtra;

    public CocheCombustion(String descripcion, COLOR color) {
        super(descripcion, PRECIO_BASE);
        this.color = color;
        // Mete en un hashmap los pares color -> precio
        if (listaCostesExtra == null) { // Si la lista aun no ha sido creada la crea y puebla
            listaCostesExtra = new HashMap<>();
            listaCostesExtra.put(BLANCO, 0.0);
            listaCostesExtra.put(AZUL, 1_500.0);
            listaCostesExtra.put(NEGRO, 2_000.0);
            listaCostesExtra.put(GRIS, 1_000.0);
        }
    }



    @Override
    public double costeExtra() {
        return listaCostesExtra.get(color);
    }

}


