
package ing.de.soft.tpn4;

/**
 *
 * @author Deb APBT
 */
public class INGDESOFTTPN4 {


    public static void main(String[] args) {
        
        Auto cascajo = new Auto("oxido", 0, "Renault", "Renault 12", "123LATA");
        Auto fordFocus = new Auto("gris", 0, "Ford", "Ford Focus", "999POWR");
        Celular celu = new Celular("Negro", "Tuenti", "Nokia 1100", 123456789, 1500);
        Padre objeto = new Padre();
        
        objeto.construirCasa("Centro", 2);
        
        Hijo mimoso = new Hijo("Juan Carlos", celu, cascajo);
        
        mimoso.conducirAuto(fordFocus);
        mimoso.jugarFutbol();
        mimoso.bailar();
        mimoso.jugarLoteria();
        System.out.println(mimoso.cantar());
        mimoso.heredarDinero(2000);
        mimoso.hacerGoles();
        
    }
    
}
