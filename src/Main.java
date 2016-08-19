/**
 * @author Rafael Leon, Julio Barahona
 * Main de ejecucion de la calculadora PosFix
 */
public class Main {


	public static void main(String []args)
	{
		//make new validation object
		Validation newInput = new Validation();

		//validation of user input
		newInput.userInput();

		CalcuPost calcu= new CalcuPost();
		//String cadena= "8 2 / 2 + 3 -";
		
		String cadena= calcu.LeerArchivo("datos.txt");
		calcu.Calcular(cadena);
		System.out.println(calcu.toString());
	}

	
}
