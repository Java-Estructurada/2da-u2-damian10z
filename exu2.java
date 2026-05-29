import java.util.Scanner;
public class exu2 {
    public static final int AguacatesPR=40;
    public static final int RejasPT =24; 
    public static final int TarimasPC = 18;
    
    public static final double PrecioConte = 150,000.;
    public static final double PrecioTarima = 7500;
    public static final double PrecioReja = 280;
    public static final double ImpuestoTasa = 0.05;

    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Sistema logistico Empacadora Oro verde");
        System.out.println("\nIngrese el total de aguacates cosechados hoy");
        System.out.println("");
        long totalAguacates = entreda.nextlong();
        System.out.println("Procesando distribucion");
        long totalRejas = obtenerCociente(totalAguacates, AguacatesPR);
        long aguacatesSueltos = obtenerResiduo(totalAguacates, AguacatesPR);
        
        long totalTarimas = obtenerCociente(totalRejas, RejasPT);
        long rejasSobrantes = obtenerResiduo(totalRejas, RejasPT);

        long contenedores = obtenerCociente(totalTarimas,TarimasPC);
        long tarimasSobrantes = obtenerResiduo(totalTarimas,TarimasPC);

        double ingresosContenedores = calcularIngreso(contenedores,PrecioConte);
        double ingresosTarimas = calcularIngreso(tarimasSobrantes, PrecioTarima);
        double ingresosRejas = calcularIngreso(rejasSobrantes,PrecioReja);
        double ingresosAguacates = calcularIngreso(aguacatesSueltos, PrecioAguacates);

        double ingresoBrutoTotal = ingresosContenedores + ingresosTarimas + ingresosRejas + ingresosAguacates;
        double impuestoAduanero = calcularImpuesto(ingresosContenedores,ImpuestoTasa);
        double ingresoNetoReal = ingresoBrutoTotal -impuestoAduanero;

        System.out.println("\n Reporte de embalaje")
        System.out.println("Contenedores completos para exportar:" + contenedores);
        System.out.println("Tarimas sobrantes:"+tarimasSobrantes);
        System.out.println("Rejas sobrantes:" + rejasSobrantes);
        System.out.println("Aguacates sueltos:" + aguacatesSueltos);

        System.out.println("\n desglose financiero");
        System.out.printf("Ingresos por contenedores $%,.2f MXN\n", ingresosContenedores);
        System.out.printf("Ingresos por tarimas: $%,.2f MXN\n" ingresosTarimas);
        System.out.printf("Ingresos por rejas $%,.2f MXN\n" ingresosRejas);
        System.out.printf("Ingresos por aguacate suelto $%,.2f MXN\n" ingresosAguacates);

         System.out.printf("\n ingreso bruto total : $%,.2f MXN\n" ingresoBrutoTotal);
         System.out.printf("impuesto aduanero(5%): -$%,.2f MXN (solo exp)\n", impuestoAduanero;)
         System.out.printf("ingreso neto real $%,.2f MXN\n:", ingresoNetoReal);
         System.out.printf("Reporte generado exitosamente:");

         entrada.close();



    }
    public static long obtenerCociente(long dividiendo, int divisor){
        return dividiendo / divisor;
    }
    public static long obtenerResiduo(long dividiendo, int divisor){
        return dividiendo % divisor; }

        public static double calcularIngreso (long cantidad, double preciounitario){
        return cantidad * preciounitario; }

        public static double calcularImpuesto(double baseImponible, double tasa) {
        return baseImponible * tasa;

       
        
    }
        
