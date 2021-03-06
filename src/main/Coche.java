package main;

public class Coche {
    
    private String matricula;
    private String marca;
    private String modelo;
    
    // Constructor

    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Set's y Get's

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    // To String

    @Override public String toString() {
        return "{ " + "matricula: " + matricula + ", marca: " + marca + ", modelo: " + modelo + " }";
    }
    
    
}
