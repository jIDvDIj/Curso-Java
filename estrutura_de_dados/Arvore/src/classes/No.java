package classes;

public class No {

	private No direita;
	private No esquerda;
	private int info;

	public No(No direita, int info, No esquerda) {
		this.direita = direita;
		this.esquerda = esquerda;
	}

	public void setInfo(int info) {
		this.info = info;
		return;
	}

	public int getInfo() {
		return info;
	}

	public void setDireita(No direita) {
		this.direita = direita;
		return;
	}

	public No getDireita() {
		return direita;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
		return;
	}

	public No getEsquerda() {
		return esquerda;
	}

}