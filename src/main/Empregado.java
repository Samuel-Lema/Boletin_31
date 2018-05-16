package main;

public abstract class Empregado {
    
    private String nombre, apellidos, dni, direccion;
    private int añosAntiguedade;
    private String telefono;
    private double salario;
    private XefeZona jefe;
    
    // Constructor

    public Empregado(String nombre, String apellidos, String dni, String direccion, int añosAntiguedade, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.añosAntiguedade = añosAntiguedade;
        this.telefono = telefono;
        this.salario = salario;
    }
    
    // Get's y Set's

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAñosAntiguedade() {
        return añosAntiguedade;
    }

    public void setAñosAntiguedade(int añosAntiguedade) {
        this.añosAntiguedade = añosAntiguedade;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario += salario;
    }

    public void setJefe(XefeZona jefe) {
        this.jefe = jefe;
    }
    
    // Imprime los datos del empleado
    
    public abstract void imprimir();
    
    // Permite asignar un jefe al empleado
    
    public abstract void cambiarSupervisor(XefeZona jefe);
    
    // Permite incrementar el salario
    
    public abstract void incrementarSalario();
    
    // To String

    @Override public String toString() {
        
        String nombreJefe = "Ninguno";
        
        if (jefe != null){
            nombreJefe = jefe.getNombre();
        }
        
        return "Empregado{ " + "nombre: " + nombre + ", apellidos:" + apellidos + ", dni: " + dni + ", direccion: " + 
                direccion + ", a\u00f1osAntiguedade: " + añosAntiguedade + ", telefono: " + telefono + ", salario:" + 
                Math.floor(salario) + ", jefe: " + nombreJefe;
    }
    
    
}
