package estruturas.arvoreAVL;

public class No {

	private No direita;
	private No esquerda;
	private int altura;
	private int info;

	public No(No esquerda, int info, No direita) {
		this.esquerda = esquerda;
		this.direita = direita;
		this.info = info;
		this.altura = 1;
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

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}