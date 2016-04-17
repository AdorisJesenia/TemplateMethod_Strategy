package adorisjesenia.mx.edu.utng.templatemethod;

/**
 * Created by Jessy on 16/04/2016.
 */
public class PrestamoFinal {

    /**
     * @param tipo
     * @param personal
     * @return Prestamo
     *
     */

    public Prestamo pedirPrestamo(Personal personal,String tipo){
        PrestamoStrategy strategy = null;

        if(personal instanceof Cambaceo){
            strategy= new Valores2Strategy();

        }else if(personal instanceof Constitucional){
            strategy= new Valores1Strategy();
        }
        return strategy.pedirPrestamo(tipo);
    }
}
