package classes;

public class No{
	
	private int info;
	private No prox;
	
	public No(int info, No prox) {
		this.info = info;
		this.prox = prox;
	}
	
	public void setinfo(int info) {
		this.info = info;
		return;
	}
	
	public int getInfo() {
		return info;
	}
	
	public No getProx() {
		return prox;
	}
	
	public void setProx(No prox) {
		this.prox = prox;
		return;
	}
}
