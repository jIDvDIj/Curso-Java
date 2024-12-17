package estruturas.arvore;

public class Arvore {
	private No raiz;

	public Arvore() {
		No H = new No(null, 7, null);
		No F = new No(null, 6, null);
		No E = new No(F, 5, H);
		No D = new No(null, 4, null);
		No C = new No(null, 3, null);
		No B = new No(C, 2, D);
		No A = new No(B, 1, E);
		this.raiz = A;

	}

	public void busca(int valor) {
		if (buscaAux(raiz, valor) == true) {
			System.out.println("pertence");
		} else {
			System.out.println("não pertence");
		}
	}

	private boolean buscaAux(No raiz, int valor) {
		if (raiz != null) {
			if (raiz.getInfo() == valor) {
				return true;
			} else {
				if (buscaAux(raiz.getEsquerda(), valor) == true) {
					return true;
				} else {
					if (buscaAux(raiz.getDireita(), valor) == true) {
						return true;
					} else {
						return false;
					}
				}
			}

		}
		return false;
	}

	public void preOrdem() {
		preOrdemAux(raiz);
	}

	private void preOrdemAux(No raiz) {
		if (raiz != null) {
			System.out.println(raiz.getInfo());
			preOrdemAux(raiz.getEsquerda());
			preOrdemAux(raiz.getDireita());
		}
	}

	public void emOrdem() {
		emOrdemAux(raiz);
	}

	private void emOrdemAux(No raiz) {
		if (raiz != null) {
			emOrdemAux(raiz.getEsquerda());
			System.out.println(raiz.getInfo());
			emOrdemAux(raiz.getDireita());
		}
	}

	public void posOrdem() {
		posOrdemAux(raiz);
	}

	private void posOrdemAux(No raiz) {
		if (raiz != null) {
			posOrdemAux(raiz.getEsquerda());
			posOrdemAux(raiz.getDireita());
			System.out.println(raiz.getInfo());
		}
	}

	public void tamanhoArvore() {
		System.out.println(tamanhoArvoreAux(raiz));
	}

	private int tamanhoArvoreAux(No raiz) {
		int a = 1;
		int b = 1;
		if (raiz != null) {
			a = a + tamanhoArvoreAux(raiz.getEsquerda());
			b = b + tamanhoArvoreAux(raiz.getDireita());
		} else {
			return -1;
		}
		if (a >= b)
			return a;
		else {
			return b;
		}

	}

	public void cheia() {
		cheiaAux(raiz);
	}

	private boolean cheiaAux(No raiz) {
		if (raiz != null) {
			if (cheiaAux(raiz.getEsquerda()) && cheiaAux(raiz.getDireita()) == true) {
				return true;
			}
		} else {
			return false;
		}
		return false;
	}

}