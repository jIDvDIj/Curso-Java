package estruturas.arvoreAVL;

public class Main {

	public static void main(String[] args) {
		
		
		
		 AVL avl = new AVL(10);
		 avl.insere(5);
	        avl.insere(16);
	        avl.insere(1);
	        avl.insere(12);
	        avl.insere(20);
		
		System.out.println(avl.preOrdem());
		
		
	}
}