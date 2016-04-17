package adorisjesenia.mx.edu.utng.templatemethod;

/**
 * Created by Jessy on 15/04/2016.
 * Para el vendedor de cambaceo
 */
public class Valores2Strategy implements PrestamoStrategy{

    @Override
    public Prestamo pedirPrestamo(String tipo) {
        Prestamo prestamo =new Prestamo();
        Empresa empresa = new Empresa();

        prestamo= empresa.obtenerPrestamo("Prestamo de hasta $70,000 pesos", tipo);

        if (prestamo.getDescripcion()== null){
            prestamo = empresa.obtenerPrestamo("Prestamo de hasta $100,000", tipo);

        }
        if (prestamo.getDescripcion()== null){
            prestamo = empresa.obtenerPrestamo("Prestamo de hasta $300,000", tipo);

        }
        if (prestamo.getDescripcion()== null){
            prestamo.setEstado("No disponible");

        }
        return prestamo;
    }
}
