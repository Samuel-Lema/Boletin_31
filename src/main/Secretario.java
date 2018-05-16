package main;

public class Secretario extends Empregado{
    
    private Despacho despacho;
    private String numeroFax;
    
    // Constructor

    public Secretario(Despacho despacho, String numeroFax, String nombre, String apellidos, String dni, String direccion, int añosAntiguedade, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, añosAntiguedade, telefono, salario);
        
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }
    
    @Override public void imprimir() {
        
        System.out.println(super.toString() + despacho.toString() + ", númeroFax: " + this.numeroFax);
    }

    @Override public void cambiarSupervisor(XefeZona jefe) {
        
        super.setJefe(jefe);
    }

    @Override public void incrementarSalario() {
        super.setSalario((this.getSalario() * 0.05f) * super.getAñosAntiguedade());
    }
}
