package classes;

public class ListaCircular{
	
	private No ref;
	
	public ListaCircular(){
		this.ref = null;
	}
	
	public void setList(int valor) {
		No novoNo = new No(valor, null);
		 No itemLista = ref;
		 
		 if(ref == null) {
			 ref = novoNo;
			 return;
		 }
		 if(valor < ref.getInfo()) {
			 novoNo.setProx(ref);
			 ref = novoNo;
			 return;
		 }
		 while(itemLista != null) {
			 if(itemLista.getProx() == null) {
				 itemLista.setProx(novoNo);
				 return;
			 }
			 if(valor > itemLista.getProx().getInfo()) {
				 itemLista = itemLista.getProx();
				 
			 }else {
				 novoNo.setProx(itemLista.getProx());
				 itemLista.setProx(novoNo);
				 return;
			 }
		 }
		 
		 
		 
	}
	
	public void removeLista(int valor) {
		No itemList = ref;
		
		if(itemList == null) {
			System.out.println("The list is empty");
			return;
		}
		
		if(itemList.getInfo() == valor) {
			ref = itemList.getProx();
			return;
		}
		
		while(itemList != null) {
			if(itemList.getProx() == null) {
				System.out.println("Não pertence a lista.");
				return;
			}
			if(itemList.getInfo()>valor) {
				System.out.println("The number isn't in list");
				return;
			}
			if(itemList.getProx().getInfo() == valor) {
				itemList.setProx(itemList.getProx().getProx());
				return;
			}
			itemList = itemList.getProx();
		}
		
	}
	
	public void printList() {
		No print = ref;
		while(print != null) {
			System.out.print(print.getInfo() + " ");
			print = print.getProx();
		}
		System.out.println();
		System.out.println("The list end");
	}
}