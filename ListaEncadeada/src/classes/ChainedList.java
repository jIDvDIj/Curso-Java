package classes;

public class ChainedList{
	
	private No head;
	
	public ChainedList(){
		this.head = null;
	}
	
	public void setList(int value) {
		No newNo = new No(value, null);
		 No itemList = head;
		 No recorderPrevNo = head;
		 
		 if(head == null) {
			 head = newNo;
			 return;
		 }
		 if(value < head.getInfo()) {
			 newNo.setNext(head);
			 head = newNo;
			 return;
		 }
		 while(itemList != null) {
			 if(itemList.getNext() == null) {
				 itemList.setNext(newNo);
				 return;
			 }
			 if(value > itemList.getInfo()) {
				 recorderPrevNo = itemList;
				 itemList = itemList.getNext();
				 
			 }else {
				 recorderPrevNo.setNext(newNo);
				 newNo.setNext(itemList);
				 return;
			 }
		 }
		 
		 
		 
	}
	
	public void removeList(int value) {
		No itemList = head;
		
		if(itemList == null) {
			System.out.println("The list is empty");
			return;
		}
		
		if(itemList.getInfo() == value) {
			head = itemList.getNext();
			return;
		}
		
		while(itemList != null) {
			if(itemList.getNext() == null) {
				System.out.println("Não pertence a lista.");
				return;
			}
			if(itemList.getNext().getInfo() == value) {
				itemList.setNext(itemList.getNext().getNext());
				return;
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