package classes;



public class Main {

	public static void main(String[] args) {
		ChainedList list = new ChainedList();
		
		list.setList("1");
		list.setList("2");
		list.setList("3");
		list.setList("4");
		
		list.printList();
		
		list.removeList("4");
		
		list.printList();
		
		
		
	}
}