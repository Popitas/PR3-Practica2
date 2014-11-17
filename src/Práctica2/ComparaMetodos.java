package Práctica2;

public class ComparaMetodos {

    public static void main (String[] args) {
        
        int[] tamaños = {1000,2000,4000,8000,16000,32000};
        
        
        DatosEstadisticos[] inverso1 = CalculadorEstadisticas.estadisticasOrdenaVectoresInversos(new Ordenar1Vector(), tamaños);
        MediaDatosEstadisticos[] aleatorio1 = CalculadorEstadisticas.estadisticasOrdenaVectoresAleatorios(new Ordenar1Vector(), tamaños);
        
        
        DatosEstadisticos[] inverso2 = CalculadorEstadisticas.estadisticasOrdenaVectoresInversos(new Ordenar2Vector(), tamaños);
        MediaDatosEstadisticos[] aleatorio2 = CalculadorEstadisticas.estadisticasOrdenaVectoresAleatorios(new Ordenar2Vector(), tamaños);
        
        System.out.println("Resultados prueba algoritmo George: ");
        
        System.out.println("                    Vector Inverso                    "
                + "            Vector aleatorio");
        System.out.println("Orden     Tiempo   N Comparaciones  N Movimientos    "
                + "|    Tiempo  N Comparaciones  N Movimientos");
        
        for (int i = 0; i < inverso2.length; i++) {
            System.out.printf("%6d     %5.4f      %5d         %5d", tamaños[i], inverso1[i].dameTiempo(), 
                    inverso1[i].dameComparaciones(), inverso1[i].dameMovimientos());
            
            System.out.printf("              %5.4f    %5.4f    %5.4f\n", aleatorio1[i].dameMediaTiempos(), 
                    aleatorio1[i].dameMediaComparaciones(), aleatorio1[i].dameMediaMovimientos());
        }
        
        
        System.out.println("Resultados prueba algoritmo Shell: ");
        
        System.out.println("                    Vector Inverso                    "
                + "            Vector aleatorio");
        System.out.println("Orden     Tiempo   N Comparaciones  N Movimientos    "
                + "|    Tiempo  N Comparaciones  N Movimientos");
        
        for (int i = 0; i < inverso2.length; i++) {
            System.out.printf("%6d     %5.4f      %5d         %5d", tamaños[i], inverso2[i].dameTiempo(), 
                    inverso2[i].dameComparaciones(), inverso2[i].dameMovimientos());
            
            System.out.printf("              %5.4f    %5.4f    %5.4f\n", aleatorio2[i].dameMediaTiempos(), 
                    aleatorio2[i].dameMediaComparaciones(), aleatorio2[i].dameMediaMovimientos());
        }
        
        
    }
}