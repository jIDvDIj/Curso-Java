package estruturas.arvoreAVL;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Teste {
    // 1-inserções simples que não requeiram balanceamento (0,5)
    @Test
    void testInsercaoSimples() {
        @SuppressWarnings("rawtypes")
        AVL avl = new AVL(10);
        avl.insere(5);
        avl.insere(16);
        avl.insere(1);
        avl.insere(12);
        avl.insere(20);
        assertEquals("10(0)5(1)1(0)16(0)12(0)20(0)", avl.preOrdem().replace(" ", "").replace(",", ""));
    }

    // 2-remoção de nó sem filhos (0,5)
    @Test
    void testRemocaoSemFilhos() {
        AVL avl = new AVL(10);
        avl.insere(5);
        avl.insere(16);
        avl.insere(1);
        avl.insere(12);
        avl.insere(20);
        avl.remove(12);
        assertEquals("10(0)5(1)1(0)16(-1)20(0)", avl.preOrdem().replace(" ", "").replace(",", ""));
    }

    // 3-remoção de nó com 1 filho à direita (0,5)
    @Test
    void testRemocaoFilhoDireita() {
        AVL avl = new AVL(10);
        avl.insere(5);
        avl.insere(16);
        avl.insere(7);
        avl.insere(12);
        avl.insere(20);
        avl.remove(5);
        assertEquals("10(-1)7(0)16(0)12(0)20(0)", avl.preOrdem().replace(" ", "").replace(",", ""));
    }

    // 4-remoção de nó com 1 filho à esquerda (0,5)
    @Test
    void testRemocaoFilhoEsquerda() {
        AVL avl = new AVL(10);
        avl.insere(5);
        avl.insere(16);
        avl.insere(1);
        avl.insere(12);
        avl.insere(20);
        avl.remove(5);
        assertEquals("10(-1)1(0)16(0)12(0)20(0)", avl.preOrdem().replace(" ", "").replace(",", ""));
    }

    // 5-remoção de nó com 2 filhos, e que seja um filho à direita (0,5)
    @Test
    void testRemocaoComDoisFilhos() {
        AVL avl = new AVL(10);
        avl.insere(5);
        avl.insere(16);
        avl.insere(1);
        avl.insere(12);
        avl.insere(20);
        avl.remove(16);
        assertEquals("10(0)5(1)1(0)20(1)12(0)", avl.preOrdem().replace(" ", "").replace(",", ""));
    }
}
