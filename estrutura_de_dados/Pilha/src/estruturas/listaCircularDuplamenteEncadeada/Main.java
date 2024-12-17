package estruturas.listaCircularDuplamenteEncadeada;

public class Main {

	public static void main(String[] args) {
		Lista list = new Lista();

		list.insere(9);
		list.insere(2);
		list.insere(4);
		list.insere(5);
		list.insere(3);
		list.insere(2);
		list.insere(3);
		list.insere(6);
		list.insere(10);

		System.out.println(list.imprime());

		list.remove(2, false);

		System.out.println(list.imprime());

	}
}