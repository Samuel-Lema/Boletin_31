package main;

public class Despacho {
    
    private String nombre;
    
    // Constructor

    public Despacho(String nombre) {
        this.nombre = nombre;
    }
    
    // Get y Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // To String

    @Override public String toString() {
        return nombre;
    }
}
