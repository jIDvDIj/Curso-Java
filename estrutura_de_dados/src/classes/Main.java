package classes;



public class Main {

	public static void main(String[] args) {
		ListaCircular list = new ListaCircular();
		
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
		
		list.removeLista(7);
		
		list.printList();
		
		
		
	}
}