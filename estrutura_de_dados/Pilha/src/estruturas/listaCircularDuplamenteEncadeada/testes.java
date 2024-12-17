package estruturas.listaCircularDuplamenteEncadeada;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testes {
	@Test
	void testVazia() {
		Lista lista = new Lista();
		String ret = lista.imprime();
		assertEquals("lista vazia", ret);
	}

	@Test
	void test() {
		Lista lista = new Lista();
		lista.insere(5);
		lista.insere(4);

		lista.insere(3);
		lista.insere(2);
		lista.insere(1);
		String ret = lista.imprime();
		assertEquals("1 2 3 4 5", ret);
	}
}