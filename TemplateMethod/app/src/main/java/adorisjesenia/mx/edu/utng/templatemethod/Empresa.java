package adorisjesenia.mx.edu.utng.templatemethod;

import java.util.ArrayList;

/**
 * Created by Jessy on 15/04/2016.
 */
public class Empresa {

    private static ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();

    public Empresa(){
        Prestamo prestamo =new Prestamo();
        prestamo.setTipo("Personal");
        prestamo.setEstado("Disponible");
        prestamo.setDescripcion("Prestamo de hasta $100,000 pesos");
        Prestamo prestamo1= new Prestamo();
        prestamo.setTipo("Hipotecario");
        prestamo.setEstado("Disponible");
        prestamo.setDescripcion("Prestamo de hasta $300,000 pesos");
        Prestamo prestamo2= new Prestamo();
        prestamo.setTipo("Automotriz");
        prestamo.setEstado("Disponible");
        prestamo.setDescripcion("Prestamo de hasta $70,000 pesos");


        prestamos.add(prestamo);
        prestamos.add(prestamo1);
        prestamos.add(prestamo2);

    }

    
    public ArrayList<Prestamo>obtenerPrestamo (){
        return prestamos;

    }
    public Prestamo obtenerPrestamo(String descripcion, String tipo){
        Prestamo prestamo = new Prestamo();
ArrayList<Prestamo> prestamos = this.obtenerPrestamo();
        for (Prestamo pres : prestamos){
            if (pres.getTipo().equals(tipo)){
                if(pres.getDescripcion().equals(descripcion)&& pres.getEstado().equals("Disponible")){
                    prestamo =pres;
                    break;
                }
            }
        }
return  prestamo;
    }
}
