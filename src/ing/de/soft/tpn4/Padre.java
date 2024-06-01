
package ing.de.soft.tpn4;


public class Padre  {
    
    private String apellido = "lopez";
    private String nombre = "papa";
    private Casa casa;
    private Auto FordFocus;
    private Casa cassa;
    
    
    public Padre(){
    }

    public Padre(Casa casa, Auto FordFocus) {
        this.casa = casa;
        this.FordFocus = FordFocus;
    }

    public Padre(Auto FordFocus) {
        this.FordFocus = FordFocus;
    }
    
    
    
    
    public String cantar(){
        
        return "Asi canta tu padre, Don lopez";
    }
    
    
    public void comprarAuto(Auto auto){
        
        
    }
    
    public Casa construirCasa(String zona, int nroDePisos){
        Casa casota = new Casa(nroDePisos, zona);
        System.out.println("Papá me dejo esta casa en zona " +zona+" ("+nroDePisos+") pisos");

        return casota;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Auto getFordFocus() {
        return FordFocus;
    }

    public void setFordFocus(Auto FordFocus) {
        this.FordFocus = FordFocus;
    }

    public Casa getCassa() {
        return cassa;
    }

    public void setCassa(Casa cassa) {
        this.cassa = cassa;
    }
    
    
}
