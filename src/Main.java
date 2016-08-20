import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
/**
 * @author Rafael Leon, Julio Barahona
 * Main de ejecucion de la calculadora PosFix
 */
public class Main {


    public static void main(String[] args) {
        //---------------------------------------------------------
        String stackOrList = "";
        String tipoImplemetacion = "";
        //---------------------------------------------------------
        /**
         * Scans user input
         */
        Scanner scan = new Scanner(System.in);
        //---------------------------------------------------------


        //user input, invalid input will keep cicle going
        while (!(stackOrList.equalsIgnoreCase("LISTA")) && !(stackOrList.equalsIgnoreCase("STACK"))) {
            //Instructions
            System.out.println("Ingrese solamente 'LISTA' o 'STACK' para comenzar");

            //Gets input and capitalize everyhting
            stackOrList = scan.next().toUpperCase();

        }

        if (stackOrList.equalsIgnoreCase("lista")) {
            // if the type of sorting is "LISTA"
            System.out.println("Ingrese el tipo de lista: Simple o circular");
            tipoImplemetacion = scan.next().toUpperCase();

            while (!(tipoImplemetacion.equalsIgnoreCase("SIMPLE")) && !(tipoImplemetacion.equalsIgnoreCase("CIRCULAR"))) {
                System.out.println("Ingrese 'simple' o 'circular'");
                tipoImplemetacion = scan.next().toUpperCase();
            }
        } else {
            while (!(tipoImplemetacion.equalsIgnoreCase("ARRAY")) && !(tipoImplemetacion.equalsIgnoreCase("VECTOR"))) {
                // if the type of sorting is "STACK"
                System.out.println("Ingrese el tipo de stack: 'array' o 'vector'");
                tipoImplemetacion = scan.next().toUpperCase();


            }

            I_Calculadora newCalcu = new CalcuPost();
            newCalcu.calculadora(stackOrList, tipoImplemetacion);
            //String cadena= "8 2 / 2 + 3 -";

            String cadena = newCalcu.LeerArchivo("datos.txt");
            newCalcu.Calcular(cadena);
            System.out.println(newCalcu.toString());
        }


    }
}
