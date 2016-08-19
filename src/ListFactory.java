
public class ListFactory extends AbstractFactory{

	@Override
	I_Stack getStack(String stack) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public I_Lista getLista(String listaType) {
		// TODO Auto-generated method stub
		if (listaType==null){
			return null;
		}
		if (listaType.equalsIgnoreCase("Single")){
			return new SinglyLinkedList();
		}else if(listaType.equalsIgnoreCase("Circular")){
			return new CircularList();
		}
		return null;
	}
	

}
