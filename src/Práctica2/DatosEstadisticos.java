package Práctica2;

public class DatosEstadisticos {

    private float tiempo;
    private int nComparaciones, nMovimientos;
    
    public DatosEstadisticos() {
        tiempo = 0;
        nComparaciones = 0;
        nMovimientos = 0;
    }
    
    public void añadeTiempo(float tiempo) {
        this.tiempo += tiempo;
    }
    
    public void añadeComparacion() {
        nComparaciones++;
    }

    public void añadeMovimiento() {
        nMovimientos++;
    }

    
    public void estableceTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
    
    public void estableceComparaciones(int n) {
        nComparaciones = n;
    }

    public void estableceMovimientos(int n) {
        nMovimientos = n;
    }
    
    public float dameTiempo() {
        return tiempo;
    }

    public int dameComparaciones() {
        return nComparaciones;
    }

    public int dameMovimientos() {
        return nMovimientos;
    }

}