package Práctica2;

public class ComparaMetodos {

    public static void main(String[] args) {

        int[] tamaños = {1000, 2000, 4000, 8000, 16000, 32000};

        DatosEstadisticos[] inverso1 = CalculadorEstadisticas.estadisticasOrdenaVectoresInversos(new Ordenar1Vector(), tamaños);
        MediaDatosEstadisticos[] aleatorio1 = CalculadorEstadisticas.estadisticasOrdenaVectoresAleatorios(new Ordenar1Vector(), tamaños);

        DatosEstadisticos[] inverso2 = CalculadorEstadisticas.estadisticasOrdenaVectoresInversos(new Ordenar2Vector(), tamaños);
        MediaDatosEstadisticos[] aleatorio2 = CalculadorEstadisticas.estadisticasOrdenaVectoresAleatorios(new Ordenar2Vector(), tamaños);

        System.out.println("Resultados prueba algoritmo George: ");

        System.out.println("                    Vector Inverso                    "
                + "            Vector aleatorio");
        System.out.println("Orden" + "\t" + "Tiempo" + "\t" + "N Comparaciones" + "\t" + "N Movimientos"
                + "\t" + "|" + "\t" + "Tiempo" + "\t" + "N Comparaciones" + "\t" + "N Movimientos");

        for (int i = 0; i < inverso2.length; i++) {
            if (String.valueOf(inverso1[i].dameComparaciones()).length() < 8) {
                System.out.printf("%6d" + "\t" + "%5.4f" + "\t" + "%5d" + "\t\t", tamaños[i], inverso1[i].dameTiempo(),
                        inverso1[i].dameComparaciones());
            } else {
                System.out.printf("%6d" + "\t" + "%5.4f" + "\t" + "%5d" +"\t", tamaños[i], inverso1[i].dameTiempo(),
                        inverso1[i].dameComparaciones());
            }

            if (String.valueOf(inverso1[i].dameMovimientos()).length() < 8) {
                System.out.printf("%5d" + "\t\t\t", inverso1[i].dameMovimientos());
                
                System.out.printf("%5.4f" + "\t" + "%5.4f" + "\t" + "%5.4f" + "\n", aleatorio1[i].dameMediaTiempos(),
                        aleatorio1[i].dameMediaComparaciones(), aleatorio1[i].dameMediaMovimientos());
            } else {
                System.out.printf("%5d" + "\t\t", inverso1[i].dameMovimientos());
                
                System.out.printf("%5.4f" + "\t" + "%5.4f" + "\t" + "%5.4f" + "\n", aleatorio1[i].dameMediaTiempos(),
                        aleatorio1[i].dameMediaComparaciones(), aleatorio1[i].dameMediaMovimientos());                
            }
        }

        System.out.println("\n" + "Resultados prueba algoritmo Shell: ");

        System.out.println("                    Vector Inverso                    "
                + "            Vector aleatorio");
        System.out.println("Orden" + "\t" + "Tiempo" + "\t" + "N Comparaciones" + "\t" + "N Movimientos"
                + "\t" + "|" + "\t" + "Tiempo" + "\t" + "N Comparaciones" + "\t" + "N Movimientos");

        for (int i = 0; i < inverso2.length; i++) {
            if (String.valueOf(inverso2[i].dameComparaciones()).length() < 8) {
                System.out.printf("%6d" + "\t" + "%5.4f" + "\t" + "%5d" + "\t\t", tamaños[i], inverso2[i].dameTiempo(),
                        inverso2[i].dameComparaciones());
            } else {
                System.out.printf("%6d" + "\t" + "%5.4f" + "\t" + "%5d" +"\t", tamaños[i], inverso2[i].dameTiempo(),
                        inverso2[i].dameComparaciones());
            }

            if (String.valueOf(inverso2[i].dameMovimientos()).length() < 8) {
                System.out.printf("%5d" + "\t\t\t", inverso2[i].dameMovimientos());
                
                System.out.printf("%5.4f" + "\t" + "%5.4f" + "\t" + "%5.4f" + "\n", aleatorio2[i].dameMediaTiempos(),
                        aleatorio2[i].dameMediaComparaciones(), aleatorio2[i].dameMediaMovimientos());
            } else {
                System.out.printf("%5d" + "\t\t", inverso2[i].dameMovimientos());
                
                System.out.printf("%5.4f" + "\t" + "%5.4f" + "\t" + "%5.4f" + "\n\n", aleatorio1[i].dameMediaTiempos(),
                        aleatorio2[i].dameMediaComparaciones(), aleatorio2[i].dameMediaMovimientos());                
            }
        }
    }
}
