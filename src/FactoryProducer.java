
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		
		if(choice.equalsIgnoreCase("LISTA")){
			return new ListFactory();
		}else if(choice.equalsIgnoreCase("STACK")){
			return new StackFactory();
		}
		return null;
	}
}
