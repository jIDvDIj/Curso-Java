package estruturas.pilha;

public class Pilha {
	private No topo;

	public Pilha() {
		this.topo = null;
	}

	public void push(int info) {
		No novoNo = new No(info, null);
		if (topo == null) {
			topo = novoNo;
		} else {
			novoNo.setProx(topo);
			topo = novoNo;
		}
	}

	public void pop() {
		if (topo == null) {
			System.out.println("Lista vazia");
		} else {
			topo = topo.getProx();
		}
	}

	public void print() {
		for (No aux = topo; aux!=null; aux = aux.getProx()) {
			System.out.print(aux.getInfo() + " ");
		}
		System.out.println();
	}
	
	public int peekPilha() {
		return topo.getInfo();
	}
	
	public void isEmptyLista() {
		if (topo == null) {
			System.out.println("lista vazia");
			
		} else {
			System.out.println("lista não vazia");
		}
	}
}