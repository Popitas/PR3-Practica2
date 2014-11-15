package Práctica2;

public class ComparaMetodos {

    public static void main (String[] args) {

        
        Ordenar2Vector metodo = new Ordenar2Vector();
        
        for (int i = 0; i < 1000; i++) {
            int[] vector = GeneraCaso.generaVector(1000, true);
            metodo.ordena(vector, new DatosEstadisticos());
            CompruebaCaso.compruebaVector(vector, 1000);
        }
    }
}