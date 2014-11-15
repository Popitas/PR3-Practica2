package Práctica2;

public class CalculadorEstadisticas {

    // modo: false = inverso, true = aleatorio
    
    /** La función estadisticaOrdenaVector obtiene datos estadísticos de un método de ordenación para un vector 
     * de un tamaño pasado por parámetro. La función tiene tres parámetros: el primero es de tipo OrdenarVector, 
     * que establece el método de ordenación a probar, el segundo es un entero que representa el tamaño y el 
     * tercero indica el orden del vector original, inverso o aleatorio, según modo sea falso o verdadero. 
     * La función devuelve un objeto de la clase DatosEstadisticos. Los datos para estas pruebas se deben 
     * obtener usando la clase GeneraCaso y se debe probar el método de ordenación usando la clase CompruebaCaso.*/
    
    public static DatosEstadisticos estadisticaOrdenaVector(OrdenarVector m, int tam_vector, boolean modo) {

        int[] vector = GeneraCaso.generaVector(tam_vector, modo);
        DatosEstadisticos datos = new DatosEstadisticos();
        m.ordena(vector, datos);
        CompruebaCaso.compruebaVector(vector, tam_vector);
        return datos;
    }
    
    
    public static DatosEstadisticos[] estadisticasOrdenaVectoresInversos(OrdenarVector m, int[] tam_vectores) {
        return new DatosEstadisticos[5];
    }
    
    
    /** La función estadisticasOrdenaVectoresInversos actúa no para un tamaño de vector si no para varios tamaños 
    * representados como un vector de enteros. Debe devolver un vector de objetos de la clase DatosEstadisticos 
    * donde cada elemento del vector representa el resultado de una llamada a estadisticaOrdenaVector para un 
    * vector inicializado en orden inverso.
    **/
    
    /** La función estadisticaOrdenaVectorAleatorio obtiene la media de los datos estadísticos de un método de 
    * ordenación para 10 vectores de un tamaño pasado por parámetro y que se inicializan en orden aleatorio. 
    * La función tiene dos parámetros: el primero es de tipo OrdenarVector, que establece el método de ordenación 
    * a probar y el segundo es un entero que representa el tamaño. La función devuelve un objeto de la clase 
    * MediaDatosEstadisticos. 
    * */
    
    public static MediaDatosEstadisticos estadisticaOrdenaVectorAleatorio(OrdenarVector m, int tam_vector) {
    
        DatosEstadisticos datos = estadisticaOrdenaVector(m, tam_vector, true);
        MediaDatosEstadisticos media = new MediaDatosEstadisticos();
        
        return media;
    }
    
    
    /** La función estadisticaOrdenaVectorAleatorio obtiene la media de los datos estadísticos de un método de 
    * ordenación para 10 vectores de un tamaño pasado por parámetro y que se inicializan en orden aleatorio. 
    * La función tiene dos parámetros: el primero es de tipo OrdenarVector, que establece el método de ordenación 
    * a probar y el segundo es un entero que representa el tamaño. La función devuelve un objeto de la clase 
    * MediaDatosEstadisticos. 

    

    La función estadisticasOrdenaVectoresAleatorios actúa no para un tamaño de vector si no para varios tamaños 
    * representados como un vector de enteros. Debe devolver un vector de objetos de la clase MediaDatosEstadisticos 
    * donde cada elemento del vector representa el resultado de una llamada a estadisticaOrdenaVectorAleatorio.
    **/
    
    public static MediaDatosEstadisticos[] estadisticasOrdenaVectoresAleatorios(OrdenarVector m, int[] tam_vectores) {
    
        MediaDatosEstadisticos[] medias = new MediaDatosEstadisticos[tam_vectores.length];
        
        for (int i = 0; i < tam_vectores.length; i++) {
            medias[i] = estadisticaOrdenaVectorAleatorio(m, tam_vectores[i]);
            
        }
        return medias;
    }
    
    
}
