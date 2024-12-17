package estruturas.listaEncadeada;



public class Main {

	public static void main(String[] args) {
		ChainedList list = new ChainedList();
		
		list.setList(9);
		list.setList(2);
		list.setList(4);
		list.setList(5);
		list.setList(3);
		list.setList(2);
		list.setList(3);
		list.setList(6);
		list.setList(7);
		
		list.printList();
		
		list.removeList(7);
		
		list.printList();
		
		
		
	}
}