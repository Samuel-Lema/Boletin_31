package main;

public class XefeZona extends Empregado {
    
    private Despacho despacho;
    private Secretario secretarioAsignado;
    private AreaVenta areaVenta;
    private Coche coche;

    // Constructor

    public XefeZona(Despacho despacho, AreaVenta areaVenta, Coche coche, String nombre, String apellidos, String dni, String direccion, int añosAntiguedade, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, añosAntiguedade, telefono, salario);
        
        this.despacho = despacho;
        this.areaVenta = areaVenta;
        this.coche = coche;
    }
    
    // Set's y Get's

    public Despacho getDespacho() {
        return despacho;
    }

    public void setDespacho(Despacho despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretarioAsignado() {
        return secretarioAsignado;
    }

    public void setSecretarioAsignado(Empregado secretarioAsignado) {
        
        if (this.secretarioAsignado != null){
            this.secretarioAsignado.cambiarSupervisor(null);
        }
        
        this.secretarioAsignado = (Secretario) secretarioAsignado;
        
        this.secretarioAsignado.cambiarSupervisor(this);
    }

    public AreaVenta getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(AreaVenta areaVenta) {
        this.areaVenta = areaVenta;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
    
    // Cambia de Coche
    
    public void cambiarCoche(Coche coche){
        
        this.coche = coche;
    }
    
    @Override public void imprimir() {
        
        System.out.println(super.toString() + this.toString());
    }

    @Override public void cambiarSupervisor(XefeZona jefe) {}

    @Override public void incrementarSalario() {
        super.setSalario((this.getSalario() * 0.20f) * super.getAñosAntiguedade());
    }
    
    // To String

    @Override public String toString() {
        return ", despacho: " + despacho + ", secretarioAsignado: " + secretarioAsignado.getNombre() + ", areaVenta: " + areaVenta.getNombre() + ", coche: " + coche + '}';
    }
    
    
}
