package estruturas.fila;

public class Fila {
	private No inicio;
	private No fim;

	public Fila() {
		this.inicio = null;
		this.fim = null;
	}

	public void enqueeu(int info) {
		No novoNo = new No(info, null);
		if (inicio == null) {
			inicio = novoNo;
			fim = novoNo;
			return;
		}
		
		fim.setProx(novoNo);
		fim = novoNo;
	}
	
	public void dequeue() {
		inicio = inicio.getProx();
	}

	public void print() {
		for (No aux = inicio; aux!=null; aux = aux.getProx()) {
			System.out.print(aux.getInfo() + " ");
		}
		System.out.println();
	}
}