package org.example.conenum;

import java.util.HashMap;

import static org.example.conenum.CocheCombustion.COLOR.*;

public class CocheCombustion extends Coche{
    enum COLOR {BLANCO,AZUL,NEGRO,GRIS}
    static final double PRECIO_BASE = 20_000.0;
    COLOR color;
    static  HashMap<COLOR,Double> LISTA_COSTES_EXTRA;

    public CocheCombustion(String descripcion, COLOR color) {
        super(descripcion, PRECIO_BASE);
        this.color = color;
        if (LISTA_COSTES_EXTRA == null) {
            LISTA_COSTES_EXTRA = new HashMap<>();
            LISTA_COSTES_EXTRA.put(BLANCO, 0.0);
            LISTA_COSTES_EXTRA.put(AZUL, 1_500.0);
            LISTA_COSTES_EXTRA.put(NEGRO, 2_000.0);
            LISTA_COSTES_EXTRA.put(GRIS, 1_000.0);
        }
    }



    @Override
    public double costeExtra() {
        return LISTA_COSTES_EXTRA.get(color);
    }

}


