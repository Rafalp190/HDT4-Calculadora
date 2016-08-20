import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
/**
 * @author Rafael Leon, Julio Barahona
 * Main de ejecucion de la calculadora PosFix
 */
public class Main {



	public static void main(String []args)
	{
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
        while (stackOrList != "LISTA" && stackOrList != "STACK"){
            //Instructions
            System.out.println("Ingrese solamente 'LISTA' o 'STACK' para comenzar");

            //Gets input and capitalize everyhting
            stackOrList = scan.next().toUpperCase();

        }

        if (stackOrList == "LISTA"){
            // if the type of sorting is "LISTA"
            System.out.println("Ingrese el tipo de lista: Simple o circular");

            while (tipoImplemetacion != "SIMPLE" && tipoImplemetacion != "CIRCULAR")
                System.out.println("Ingrese 'simple' o 'circular'");
                tipoImplemetacion = scan.next().toUpperCase();
        }
        else{
            while (tipoImplemetacion != "ARRAY" && tipoImplemetacion != "VECTOR") {
                // if the type of sorting is "STACK"
                System.out.println("Ingrese el tipo de stack: 'array' o 'vector'");
                tipoImplemetacion = scan.next().toUpperCase();
            }

        }

		I_Calculadora calcu= new Calculadora(stackOrList, tipoImplemetacion);
		//String cadena= "8 2 / 2 + 3 -";
		
		String cadena= calcu.LeerArchivo("datos.txt");
		calcu.Calcular(cadena);
		System.out.println(calcu.toString());
	}

	
}
