package main;

import java.util.ArrayList;

public class AreaVenta {
    
    private String nombre;
    private ArrayList<Vendedor> listaVendedores = new ArrayList<>();
    
    // Constructor

    public AreaVenta(String nombre) {
        this.nombre = nombre;
    }
    
    // Set's y Get's

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    // Añade un vendedor a la lista de vendedores
    
    public void añadirVendedor(Empregado vendedor){
        
        listaVendedores.add((Vendedor) vendedor);
    }  
    
    // Añade un vendedor a la lista de vendedores
    
    public void eliminarVendedor(Empregado vendedor){
        
        listaVendedores.remove((Vendedor) vendedor);
    } 
}
