package Práctica2;

public class MediaDatosEstadisticos {
    
    DatosEstadisticos datos_media;
    int tam_muestra;

    public MediaDatosEstadisticos() {
        datos_media = new DatosEstadisticos();
        tam_muestra = 0;
    }
    
    public void añadeDatosEstadisticos(DatosEstadisticos datos) {
        
        tam_muestra++;
        datos_media.estableceTiempo(datos_media.dameTiempo() + datos.dameTiempo());
        datos_media.estableceComparaciones(datos_media.dameComparaciones() + datos.dameComparaciones());
        datos_media.estableceMovimientos(datos_media.dameMovimientos() + datos.dameMovimientos()); 
    }
    
    public float dameMediaTiempos() {
        return datos_media.dameTiempo()/tam_muestra;
        
    }
    
    public float dameMediaComparaciones() {
        return datos_media.dameComparaciones()/tam_muestra;
    }
    
    public float dameMediaMovimientos() {
        return datos_media.dameMovimientos()/tam_muestra;
    }
}
