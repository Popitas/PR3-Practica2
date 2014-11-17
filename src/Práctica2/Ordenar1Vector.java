package Práctica2;

public class Ordenar1Vector implements OrdenarVector {

    public String nombreMetodo() {
        return "ordena";
    }

    @Override
    public void ordena(int[] vector, DatosEstadisticos de) {
        long tiempo = System.currentTimeMillis();
        
        for (int i = 0; i < vector.length - 1; i++) {
            
            for (int j = i; j < vector.length; j++) {
                
                de.añadeComparacion();
                if (vector[j] < vector[i]) {
                    int aux = vector[j];
                    
                    for (int k = j; k > i; k--) {
                        vector[k] = vector[k - 1];
                        de.añadeMovimiento();
                    }
                    vector[i] = aux;
                    de.añadeMovimiento();
                }
            }
        }
        de.estableceTiempo((float) ((System.currentTimeMillis() - tiempo)/1000.0));
    }

   
}