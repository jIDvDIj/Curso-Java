package classes;

public class No {

	private No direita;
	private No esquerda;
	private int info;

	public No(No esquerda, int info, No direita) {
		this.esquerda = esquerda;
		this.direita = direita;
		this.info = info;
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