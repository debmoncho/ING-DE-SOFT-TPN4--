
package ing.de.soft.tpn4;

public class Hijo extends Padre implements Madre, Tio, Hermano{
    
    private double billetera;
    private Celular celular;
    private String nombre;
    
    


    public Hijo(String nombre,Celular celular ,Auto FordFocus) {
        super(FordFocus);
        this.nombre= nombre;
        this.celular = celular;
        
        System.out.println("soy el hijo "+this.nombre+" herede de mi padre su apellido: "+ super.getApellido());
        System.out.println("papa me dejo este auto modelo: "+FordFocus.getModelo());
    }
    
    
    

    @Override
    public void bailar() {
        System.out.println("Se bailar como mi madre ♪ ♫ ♪");
    }

    @Override
    public int jugarLoteria() {
        this.billetera += Madre.fortuna;
        System.out.println("SALIO NUMERO DE LA SUERTE "+Madre.nroSuerte);
        System.out.println("Heredaste la Fortuna de "+Madre.fortuna+" de tu "+Madre.nombre);
        System.out.println("Ahora tienes "+this.billetera+"$S!!!");
        return Madre.nroSuerte;
    }

    @Override
    public void heredarDinero(double dinero) {
        
        System.out.println("Tio Lucas te regala estos Dolalitos: "+dinero);
        this.billetera+=dinero;
        System.out.println("Disfruta la herencia Addams, ahora tenes " +this.billetera+" dolaritos");
    }

    @Override
    public int hacerGoles() {
        int goles=0;
        System.out.println("Juando al Futbol, Hoy has hecho "+ goles +" Goles ");
        return goles;
    }

    @Override
    public void jugarFutbol() {
        System.out.println("Se jugar Futbol gracias a mi hermano");
    }
    @Override
    public String cantar(){
        return super.cantar()+" y asi canta Juan Carlos ";
    }
    
    public void conducirAuto(Auto auto){
        
        System.out.println("conduciendo un "+auto.getModelo()+" de un amigo");
        
    }
     
}
