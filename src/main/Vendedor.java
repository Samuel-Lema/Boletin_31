package main;

import java.util.ArrayList;

public class Vendedor extends Empregado{
    
    private Coche coche;
    private String tlfMobil;
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private float porcentaxeComision = 0;
    
    // Constructor

    public Vendedor(Coche coche, String tlfMobil, float comision, String nombre, String apellidos, String dni, String direccion, int añosAntiguedade, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, añosAntiguedade, telefono, salario);
        
        this.coche = coche;
        this.tlfMobil = tlfMobil;
        this.porcentaxeComision = comision;
    }
    
    // Da de alta un nuevo cliente
    
    public void añadirCliente(Cliente cliente){
        
        listaClientes.add(cliente);
    }
    
    // Da de baja un cliente
    
    public void eliminarCliente(Cliente cliente){
        
        listaClientes.remove(cliente);
    }
    
    // Cambia de Coche
    
    public void cambiarCoche(Coche coche){
        
        this.coche = coche;
    }
        
    @Override public void imprimir() {
        
        System.out.println(super.toString() + this.tlfMobil +  ", porcentajeComisión: " + this.porcentaxeComision + "%");
    }

    @Override public void cambiarSupervisor(XefeZona jefe) {
        
        super.setJefe(jefe);
    }

    @Override public void incrementarSalario() {
        super.setSalario((this.getSalario() * 0.10f) * super.getAñosAntiguedade());
    }
}
