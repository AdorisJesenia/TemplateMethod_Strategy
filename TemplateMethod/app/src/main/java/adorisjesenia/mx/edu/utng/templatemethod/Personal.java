package adorisjesenia.mx.edu.utng.templatemethod;

/**
 * Creaintted by Jessy on 01/04/2016.
 */
public abstract class Personal {

    //Atributos de la clase
    private String nombre;
    private float salarioBase;
    private float ingreso;
    private float productividad;


    //Template Method

    public void calcularBonos() {
        calculaBonosProductividad();
        calculaIngresoMensual();
    }

    //Metodos implemetados por las clases hijas
    protected abstract int calculaIngresoMensual();


    protected abstract void calculaBonosProductividad();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getIngreso() {
        return ingreso;
    }

    public void setIngreso(float ingreso) {
        this.ingreso = ingreso;
    }

    public float getProductividad() {
        return productividad;
    }

    public void setProductividad(float productividad) {
        this.productividad = productividad;
    }


}