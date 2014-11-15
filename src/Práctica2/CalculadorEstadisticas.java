package Práctica2;

public class CalculadorEstadisticas {

    // modo: false = inverso, true = aleatorio    
    public static DatosEstadisticos estadisticaOrdenaVector(OrdenarVector m, int tam_vector, boolean modo) {

        DatosEstadisticos datos = new DatosEstadisticos();
        
        int[] vector = GeneraCaso.generaVector(tam_vector, modo);
        m.ordena(vector, datos);
        CompruebaCaso.compruebaVector(vector, tam_vector);
        
        return datos;
    }
    
    public static DatosEstadisticos[] estadisticasOrdenaVectoresInversos(OrdenarVector m, int[] tam_vectores) {
        DatosEstadisticos[] datos = new DatosEstadisticos[tam_vectores.length];
        
        for (int i = 0; i < datos.length; i++) {
            datos[i] = estadisticaOrdenaVector(m, tam_vectores[i], false);
        }
        
        return datos;
    }
    
    public static MediaDatosEstadisticos estadisticaOrdenaVectorAleatorio(OrdenarVector m, int tam_vector) {

        MediaDatosEstadisticos media = new MediaDatosEstadisticos();
        
        for (int i = 0; i < 10; i++) {
            media.añadeDatosEstadisticos(estadisticaOrdenaVector(m, tam_vector, true));
        }
        
        return media;
    }

    public static MediaDatosEstadisticos[] estadisticasOrdenaVectoresAleatorios(OrdenarVector m, int[] tam_vectores) {
    
        MediaDatosEstadisticos[] medias = new MediaDatosEstadisticos[tam_vectores.length];
        
        for (int i = 0; i < tam_vectores.length; i++) {
            medias[i] = estadisticaOrdenaVectorAleatorio(m, tam_vectores[i]);
        }
        
        return medias;
    }
    
    
}
