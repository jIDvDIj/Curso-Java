package estruturas.listaCircular;

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
    void test1() {
        Lista lista = new Lista();
        lista.insere(5);
        lista.insere(4);
        lista.insere(3);
        lista.insere(2);
        lista.insere(1);
        String ret = lista.imprime();
        assertEquals("1 2 3 4 5", ret);
    }

    @Test
    void testRemovePrimeiraOcorrencia() {
        Lista lista = new Lista();
        lista.insere(3);
        lista.insere(5);
        lista.insere(4);
        lista.insere(3);
        lista.insere(2);
        lista.insere(1);
        lista.remove(3, false);
        String ret = lista.imprime();
        assertEquals("1 2 3 4 5", ret);
    }

    @Test
    void testRemoveTodasOcorrencias() {
        Lista lista = new Lista();
        lista.insere(5);
        lista.insere(4);
        lista.insere(3);
        lista.insere(2);
        lista.insere(3);
        lista.insere(1);
        lista.remove(3, true);
        String ret = lista.imprime();
        assertEquals("1 2 4 5", ret);
    }

    @Test
    void testRemoveTodasOcorrencias2() {
        Lista lista = new Lista();
        lista.insere(2);
        lista.insere(3);
        lista.insere(1);
        lista.insere(1);
        lista.remove(1, true);
        String ret = lista.imprime();
        assertEquals("2 3", ret);
    }

    @Test
    void testRemoveMultiples() {
        Lista lista = new Lista();
        lista.insere(2);
        lista.insere(3);
        lista.insere(1);
        lista.insere(3);
        lista.insere(3);
        lista.remove(3, true);
        String ret = lista.imprime();
        assertEquals("1 2", ret);
    }

    @Test
    void testComplexo() {
        Lista lista = new Lista();
        lista.insere(2);
        lista.insere(1);
        lista.insere(3);
        lista.insere(1);
        lista.insere(3);
        lista.insere(4);
        lista.remove(3, true);
        lista.remove(1, true);
        lista.remove(4, true);
        lista.remove(2, false);
        lista.insere(150);
        lista.insere(100);
        String ret = lista.imprime();
        assertEquals("100 150", ret);
    }
}