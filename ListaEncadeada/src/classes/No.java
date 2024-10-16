package classes;

public class No{
	
	private int info;
	private No next;
	
	public No(int info, No next) {
		this.info = info;
		this.next = next;
	}
	
	public void setinfo(int info) {
		this.info = info;
		return;
	}
	
	public int getInfo() {
		return info;
	}
	
	public No getNext() {
		return next;
	}
	
	public void setNext(No next) {
		this.next = next;
		return;
	}
}
