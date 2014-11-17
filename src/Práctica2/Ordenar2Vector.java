package Práctica2;

public class Ordenar2Vector implements OrdenarVector{

    @Override
    public String nombreMetodo() {
        return "ordena";
    }

    @Override
    public void ordena(int[] vector, DatosEstadisticos de) {
        long tiempo = System.currentTimeMillis();
        
        int dist = vector.length/2;
        
        while (dist > 0) {
            
            for (int i = 0; i < vector.length - dist; i++) {
                int j = i+dist;
                
                de.añadeComparacion(); 
                // cambio algoritmo pdf: j>dist cambia a:
                while((j>=dist) && (vector[j] < vector[j-dist])) {
                    int aux = vector[j];
                    vector[j] = vector[j-dist];
                    vector[j-dist] = aux;
                    
                    de.añadeMovimiento(); de.añadeMovimiento();
                    
                    j = j-dist;
                }
            }
            dist = dist/2;
        }
        
        de.añadeTiempo((float) ((System.currentTimeMillis() - tiempo)/1000.0));
        
    }
}