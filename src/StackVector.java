
import java.util.Vector;

/**
 * @author Rafael Leon, Julio Barahona
 *Implementacion de Stack con vectores
 *Tomado del ejemplo del libro de texto
 * @param <E>
 */
public class StackVector<E> implements I_Stack<E>
{
	
	Vector<E> vector= new Vector<>();

	/* (non-Javadoc)
	 * @see I_Stack#push(java.lang.Object)
	 */
	@Override
	public void push(E element) {
		// TODO Auto-generated method stub
		vector.addElement(element);
	}

	/* (non-Javadoc)
	 * @see I_Stack#pop()
	 */
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		E last= vector.lastElement();
		vector.remove(vector.size()-1);
		return last;
	}

	/* (non-Javadoc)
	 * @see I_Stack#IsEmpty()
	 */
	@Override
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return vector.isEmpty();
	}

	/* (non-Javadoc)
	 * @see I_Stack#Size()
	 */
	@Override
	public int Size() {
		// TODO Auto-generated method stub
		return vector.size();
	}

	/* (non-Javadoc)
	 * @see I_Stack#get()
	 */
	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
