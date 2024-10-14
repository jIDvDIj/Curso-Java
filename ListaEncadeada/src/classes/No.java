package classes;

public class No{
	
	private String info;
	private No next;
	
	public No(String info, No next) {
		this.info = info;
		this.next = next;
	}
	
	public void setinfo(String info) {
		this.info = info;
		return;
	}
	
	public String getInfo() {
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
