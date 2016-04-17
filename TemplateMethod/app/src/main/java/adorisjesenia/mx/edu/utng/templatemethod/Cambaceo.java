package adorisjesenia.mx.edu.utng.templatemethod;

/**
 * Created by Jessy on 05/04/2016.
 */
public class Cambaceo extends Personal{
    //Atributos propios de la clase
    private int autosVendidos;
    private int bono =7000;

    //Metodos implemtados de la superclase
    @Override
    protected void calculaBonosProductividad() {
        super.setProductividad(bono*autosVendidos);
    }

    public int getAutosVendidos() {
        return autosVendidos;
    }
    @Override
    protected int calculaIngresoMensual() {
        super.setIngreso(bono*autosVendidos+super.getSalarioBase());
        return 0;
    }

//Getters y Setters

    public void setAutosVendidos(int autosVendidos) {
        this.autosVendidos = autosVendidos;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }
}

