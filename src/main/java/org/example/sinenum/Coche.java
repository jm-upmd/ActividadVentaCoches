package org.example.conenum;

public abstract class Coche implements Comparable<Coche>{
    private String identificador;
    private Double precioBase;

    public Coche(String descripcion, Double precioBase) {
        this.identificador = descripcion;
        this.precioBase = precioBase;
    }

    public String getIdentificador() {
        return identificador;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    // Método abstracto para que cada clase hija implemente cómo calucula el coste extra.
    public abstract double costeExtra();

    public double precioTotal (){
        return precioBase + costeExtra();
    }

    @Override
    public String toString() {
        String sb = identificador + "\n" +
                "Precio: " + precioTotal() + "\n" +
                "El precio incluye un coste extra de " + costeExtra();
        return sb;

    }

    @Override
    public int compareTo(Coche o) {
        return (int) (precioTotal() - o.precioTotal());
    }



}
