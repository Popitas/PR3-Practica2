package Práctica2;

public class ComparaMetodos {

    public static void main(String[] args) {

        int[] tamaños = {1000, 2000, 4000, 8000, 16000, 32000};

        DatosEstadisticos[] inverso1 = CalculadorEstadisticas.estadisticasOrdenaVectoresInversos(new Ordenar1Vector(), tamaños);
        MediaDatosEstadisticos[] aleatorio1 = CalculadorEstadisticas.estadisticasOrdenaVectoresAleatorios(new Ordenar1Vector(), tamaños);

        DatosEstadisticos[] inverso2 = CalculadorEstadisticas.estadisticasOrdenaVectoresInversos(new Ordenar2Vector(), tamaños);
        MediaDatosEstadisticos[] aleatorio2 = CalculadorEstadisticas.estadisticasOrdenaVectoresAleatorios(new Ordenar2Vector(), tamaños);

        mostrar("Práctica1", tamaños, inverso1, aleatorio1);
        mostrar("Shell", tamaños, inverso2, aleatorio2);
    }

    private static void mostrar(String nombreAlgoritmo, int[] tamaños, DatosEstadisticos[] inverso, MediaDatosEstadisticos[] aleatorio) {
        System.out.println("Resultados prueba algoritmo " + nombreAlgoritmo + ": \n");
        
        System.out.println(centerString("Vector Inverso", 40));
        printTableHeader();
        printInverseVectorTable(tamaños, inverso);

        System.out.println("");
        
        System.out.println(centerString("Vector Aleatorio", 40));
        printTableHeader();
        printRandomVectorTable(tamaños, aleatorio);
        
        System.out.println("");
    }

    private static void printTableHeader() {
        System.out.printf("%7s %7s %14s %12s\n", "Tamaño", "Tiempo", "Comparaciones", "Movimientos");
    }

    private static String centerString(String string, int spaceWidth) {
        String leftSpaces = new String();

        for (int i = 0; i < (spaceWidth / 2 - string.length() / 2); i++) {
            leftSpaces += " ";
        }

        return leftSpaces + string;
    }

    private static void printInverseVectorTable(int[] tamaños, DatosEstadisticos[] inverso) {
        for (int i = 0; i < inverso.length; i++) {
            System.out.printf("%7d %7.4f %14d %12d\n", tamaños[i], inverso[i].dameTiempo(),
                    inverso[i].dameComparaciones(), inverso[i].dameMovimientos());
        }
    }

    private static void printRandomVectorTable(int[] tamaños, MediaDatosEstadisticos[] aleatorio) {
        for (int i = 0; i < aleatorio.length; i++) {
            System.out.printf("%7d %7.4f %14.0f %12.0f\n", tamaños[i], aleatorio[i].dameMediaTiempos(),
                    aleatorio[i].dameMediaComparaciones(), aleatorio[i].dameMediaMovimientos());
        }
    }
}
