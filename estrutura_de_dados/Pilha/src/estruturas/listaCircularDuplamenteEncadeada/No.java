package estruturas.listaCircularDuplamenteEncadeada;

public class No {

	private int info;
	private No prox;
	private No ant;

	public No( No ant, int info, No prox) {
		this.info = info;
		this.prox = prox;
		this.ant = ant;
	}

	public void setinfo(int info) {
		this.info = info;
		return;
	}

	public int getInfo() {
		return info;
	}

	public void setProx(No prox) {
		this.prox = prox;
		return;
	}

	public No getProx() {
		return prox;
	}
	
	public void setAnt(No ant) {
		this.ant = ant;
		return;
	}

	public No getAnt() {
		return ant;
	}
}
