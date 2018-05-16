package main;

public class Cliente {
    
    private String nombre;
    private String dni;
    
    // Constructor

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Set's y Get's

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
}
