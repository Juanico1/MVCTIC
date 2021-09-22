package modelo;

public class MotorModel {
    private String registro;
    private String marca;
    private int cantidadMotores;
    private String propietario;
    private int autonomiaHoras;

    public MotorModel(String registro, String marca, int cantidadMotores, String propietario, int autonomiaHoras) {
        this.registro = registro;
        this.marca = marca;
        this.cantidadMotores = cantidadMotores;
        this.propietario = propietario;
        this.autonomiaHoras = autonomiaHoras;
    }

    /**
     * @return the registro
     */
    public String getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(String registro) {
        this.registro = registro;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the cantidadMotores
     */
    public int getCantidadMotores() {
        return cantidadMotores;
    }

    /**
     * @param cantidadMotores the cantidadMotores to set
     */
    public void setCantidadMotores(int cantidadMotores) {
        this.cantidadMotores = cantidadMotores;
    }

    /**
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * @return the autonomiaHoras
     */
    public int getAutonomiaHoras() {
        return autonomiaHoras;
    }

    /**
     * @param autonomiaHoras the autonomiaHoras to set
     */
    public void setAutonomiaHoras(int autonomiaHoras) {
        this.autonomiaHoras = autonomiaHoras;
    }
    
    public Object[] toArray(){
        Object[] data = {registro, marca, cantidadMotores, propietario, autonomiaHoras};
        return data;
    }
}
