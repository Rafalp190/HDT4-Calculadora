public class StackFactory extends AbstractFactory{
	@Override
	public I_Stack getStack(String stackType){
		
		if (stackType== null){
			return null;
		}
		if (stackType.equalsIgnoreCase("VECTOR")){
			return new StackVector();
		}else if (stackType.equalsIgnoreCase("ARRAY")){
			return new StackArrayList();
		}
		return null;
	}

	@Override
	I_Lista getLista(String lista) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
