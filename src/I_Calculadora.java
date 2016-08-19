
/**
 * @author Rafael Leon, Julio Barahona
 * Interfaz de la calculadroa
 */
public interface I_Calculadora 
{
	
	/**
	 * @param vector
	 * Calcula usando un stack 
	 */
	public int Calcular (String vector);
	/**
	 * @return String de la calculadora
	 */
	public String toString();
	/**
	 * @param direccion
	 * @return Lee un archivo de texto
	 */
	public String LeerArchivo(String direccion);
}
