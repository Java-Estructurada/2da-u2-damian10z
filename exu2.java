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
        System.out.println("/nIngrese el total de aguacates cosechados hoy");
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
        double ingresosTarimas = calcularIngreso(tarimasSobrantes, )
        



    }


        


    }
        
