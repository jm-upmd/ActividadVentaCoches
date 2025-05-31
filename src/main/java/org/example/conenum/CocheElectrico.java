package org.example;

public class CocheElectrico extends Coche {
    double coeficienteAutonomia;

    public CocheElectrico(String descripcion, Double precioBase, double coeficienteAutonomia) {
        super(descripcion,precioBase);
        this.coeficienteAutonomia = coeficienteAutonomia;


    }


    @Override
    public double costeExtra() {

        return getPrecioBase() * coeficienteAutonomia;
    }
}
