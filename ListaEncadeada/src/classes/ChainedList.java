package classes;

public class ChainedList{
	
	private No head;
	
	public ChainedList(){
		this.head = null;
	}
	
	public void setList(String value) {
		 No newNo = new No(value, head);
		 head = newNo;
	}
	
	public void removeList(String value) {
		No itemList = head;
		
		if(itemList.getInfo().equals(value)) {
			head =itemList.getNext();
			return;
		}
		
		while(itemList.getNext() != null) {
			
			if(itemList.getNext().getInfo().equals(value)) {
				itemList.setNext(itemList.getNext().getNext());
			}
			itemList = itemList.getNext();
		}
	}
	
	public void printList() {
		No print = head;
		while(print != null) {
			System.out.print(print.getInfo() + " ");
			print = print.getNext();
		}
		System.out.println();
		System.out.println("The list end");
	}
}