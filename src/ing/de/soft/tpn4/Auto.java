
package ing.de.soft.tpn4;


public class Auto {
    
    private String color;
    private double combustible;
    private String marca;
    private String modelo;
    private String patente;
    private int tanqueLleno = 50;

    public Auto(String color, double combustible, String marca, String modelo, String patente) {
        this.color = color;
        this.combustible = combustible;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
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

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getTanqueLleno() {
        return tanqueLleno;
    }

    public void setTanqueLleno(int tanqueLleno) {
        this.tanqueLleno = tanqueLleno;
    }
    
    
    
    
    
    
    
}
