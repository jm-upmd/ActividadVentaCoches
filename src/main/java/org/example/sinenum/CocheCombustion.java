package org.example.sinenum;

import java.util.HashMap;

public class CocheCombustion extends Coche {
    static final double PRECIO_BASE = 20_000.0;
    String color;

    public CocheCombustion(String descripcion, String color) {
        super(descripcion, PRECIO_BASE);
        this.color = color;

    }



    @Override
    public double costeExtra() {
        return switch (color.toUpperCase()){
            case "BLANCO" -> 0.0;
            case "NEGRO" -> 2_000.0;
            case "AZUL" -> 1_5000.0;
            case "GRIS" -> 1_000.0;
            // Cramos una excepcion y la lanzamos.
            default -> throw new RuntimeException("Error. Color no contemplado");

        };

    }

}


