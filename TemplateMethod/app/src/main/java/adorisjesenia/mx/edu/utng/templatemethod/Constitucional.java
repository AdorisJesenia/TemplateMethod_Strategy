package adorisjesenia.mx.edu.utng.templatemethod;

/**
 * Created by Jessy on 05/04/2016.
 */
public class Constitucional extends Personal {

    //Atributos propios de la clase
    private int camionesVendidos;
    private int bono = 10000;

    //Metodos implementados de la superclase
    @Override
    protected void calculaBonosProductividad() {
        super.setProductividad(camionesVendidos*bono);
    }

    @Override
    protected int calculaIngresoMensual() {
        super.setIngreso(bono*camionesVendidos+super.getSalarioBase());
        return 0;
    }
    //Getters y Setters

    public  int getCamionesVendidos() {
        return camionesVendidos;
    }

    public void setCamionesVendidos(int camionesVendidos) {
        this.camionesVendidos = camionesVendidos;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

}