package classes;

public class Main {

	public static void main(String[] args) {

		Lista lista = new Lista();
        lista.insere(2);
        lista.insere(1);
        lista.insere(3);
        lista.insere(1);
        lista.insere(3);
        lista.insere(4);
        System.out.println(lista.imprime());
        lista.remove(3, true);
        System.out.println(lista.imprime());
        lista.remove(1, true);
        System.out.println(lista.imprime());
        lista.remove(4, true);
        System.out.println(lista.imprime());
        lista.remove(2, false);
        System.out.println(lista.imprime());
        lista.insere(150);
        lista.insere(100);
        String ret = lista.imprime();
        System.out.println(ret);
       
	}
}