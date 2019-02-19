
package punto3;
import java.util.Scanner;

/**
 * @author Mendoza
 */
public class PerfectNumberList {

    public static void main(String[] args) {
     PerfectNumberList Numero = new PerfectNumberList();
                
        System.out.print("Introduzca el límite superior (entero positivo): ");
        Scanner in = new Scanner(System.in);
        if ( ! in.hasNextInt()) {
            System.out.println("El limite superior no es valido,intente nuevamente");
            return;
        }
        int LimiteSup = in.nextInt();
        
        if (LimiteSup < 0) {
            System.out.println("El límite superior no es válido. intenta nuevamente");
            return;
        }
        
        System.out.println("Estos son los numeros perfectos:");
        int ContNumPerfectos   = 0;
        for (int i = 1; i <= LimiteSup; i++) {
            if ( ! Numero.esPerfecto(i)) {
                continue;
            }
            System.out.printf("%d ", i);
            ContNumPerfectos++;
        }
        System.out.println("\n Numeros perfectos encontrados \n"+
                ContNumPerfectos+ ((double)100 * ContNumPerfectos/LimiteSup)
        );
        
        System.out.println();
        
        System.out.println("Estos números no son ni deficientes ni perfectos::");
        int ContNumDeficientes = 0;
        for (int i = 1; i <= LimiteSup; i++) {
            if ( Numero.esdeficiente(i) || Numero.esPerfecto(i)) {
                continue;
            }
            System.out.printf("%d ", i);
            ContNumDeficientes++;
        }
        System.out.printf("\n[%1$d Numeros encontrados (%2$.2f%%)]\n",
                ContNumDeficientes, ((double)100 * ContNumDeficientes/LimiteSup)
        );     
    }
      private boolean esdeficiente(int posInt)
    {
        int SumDivisor = 0;
        for (int i = 1 ; i < posInt; i++) {
            SumDivisor += (posInt%i == 0) ? i : 0;
        }
        return (SumDivisor < posInt);
    }     
    
    private boolean esPerfecto(int posInt)
    {
        int SumDiv = 0;
        for (int i = 1 ; i < posInt; i++) {
            SumDiv += (posInt%i == 0) ? i : 0;
        }
        return (SumDiv == posInt);
    }
    
 
}    


        