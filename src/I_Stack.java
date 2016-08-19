
/**
 * @author Rafael Leon, Julio Barahona
 *
 * @param <E>
 */
public interface I_Stack <E>
{
	/**
	 * @param element Guarda un elemento en el stack
	 */
	public void push(E element);
	/**
	 * @return Saca un elemento del stack
	 */
	public E pop();
	/**
	 * @return Revisa si el stack esta vacio
	 */
	public boolean IsEmpty();
	/**
	 * @return Devuelve el tamno del stack
	 */
	public int Size();
	/**
	 * @return El valor del stack
	 */
	public E get();

}
