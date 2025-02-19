package estruturas.arvoreAVL;

public class AVL {
	private No raiz;

	public AVL(int info) {
		this.raiz = new No(null, info, null);

	}

	public void busca(int valor) {
		if (buscaAux(raiz, valor) != null) {
			System.out.println("pertence");
		} else {
			System.out.println("não pertence");
		}
	}

	private No buscaAux(No raiz, int valor) {
		if (raiz == null) {
			return null;
		}
		if (raiz.getInfo() == valor) {
			return raiz;
		}
		if (valor < raiz.getInfo()) {
			return buscaAux(raiz.getEsquerda(), valor);
		}
		return buscaAux(raiz.getDireita(), valor);
	}

	public String preOrdem() {
		StringBuilder sb = new StringBuilder();
		preOrdemAux(raiz, sb);
		return sb.toString();
	}

	private void preOrdemAux(No raiz, StringBuilder sb) {
		if (raiz != null) {
			sb.append(raiz.getInfo()).append("(").append(getBalance(raiz)).append(")");
			preOrdemAux(raiz.getEsquerda(), sb);
			preOrdemAux(raiz.getDireita(), sb);
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

	private No minimo(No no) {
		while (no.getEsquerda() != null) {
			no = no.getEsquerda();
		}
		return no;
	}

	public No maximo(No raiz) {
		while (raiz != null) {
			raiz = raiz.getDireita();
		}
		return raiz;
	}

	public No sucessor(int valor) {
		No no = buscaAux(raiz, valor);
		if (no == null) {
			return null;
		}
		return sucessorAux(raiz, no);
	}

	private No sucessorAux(No raiz, No no) {

		if (no.getDireita() != null) {
			return minimo(no.getDireita());
		}

		No sucessor = null;
		No antecessor = raiz;
		while (antecessor != no) {
			if (no.getInfo() < antecessor.getInfo()) {
				sucessor = antecessor;
				antecessor = antecessor.getEsquerda();
			} else {
				antecessor = antecessor.getDireita();
			}
		}
		return sucessor;
	}

	public void insere(int info) {
		raiz = insereAux(raiz, info);
	}

	private No insereAux(No raiz, int info) {
		if (raiz == null) {
			return new No(null, info, null);
		}

		if (info < raiz.getInfo()) {
			raiz.setEsquerda(insereAux(raiz.getEsquerda(), info));
		} else if (info > raiz.getInfo()) {
			raiz.setDireita(insereAux(raiz.getDireita(), info));
		} else {
			return raiz;
		}

		raiz.setAltura(1 + Math.max(altura(raiz.getEsquerda()), altura(raiz.getDireita())));

		int balance = getBalance(raiz);

		if (balance > 1 && info < raiz.getEsquerda().getInfo()) {
			return rotacaoDireita(raiz);
		}

		if (balance < -1 && info > raiz.getDireita().getInfo()) {
			return rotacaoEsquerda(raiz);
		}

		if (balance > 1 && info > raiz.getEsquerda().getInfo()) {
			raiz.setEsquerda(rotacaoEsquerda(raiz.getEsquerda()));
			return rotacaoDireita(raiz);
		}

		if (balance < -1 && info < raiz.getDireita().getInfo()) {
			raiz.setDireita(rotacaoDireita(raiz.getDireita()));
			return rotacaoEsquerda(raiz);
		}

		return raiz;
	}

	public void remove(int info) {
		raiz = removeAux(raiz, info);
	}

	private No removeAux(No raiz, int info) {
		if (raiz == null) {
			return null;
		}

		if (info < raiz.getInfo()) {
			raiz.setEsquerda(removeAux(raiz.getEsquerda(), info));
		} else if (info > raiz.getInfo()) {
			raiz.setDireita(removeAux(raiz.getDireita(), info));
		} else {

			if (raiz.getEsquerda() == null || raiz.getDireita() == null) {
				raiz = (raiz.getEsquerda() != null) ? raiz.getEsquerda() : raiz.getDireita();
			} else {

				No sucessor = minimo(raiz.getDireita());
				raiz.setInfo(sucessor.getInfo());
				raiz.setDireita(removeAux(raiz.getDireita(), sucessor.getInfo()));
			}
		}

		if (raiz == null) {
			return null;
		}

		raiz.setAltura(1 + Math.max(altura(raiz.getEsquerda()), altura(raiz.getDireita())));

		int balance = getBalance(raiz);

		if (balance > 1 && getBalance(raiz.getEsquerda()) >= 0) {
			return rotacaoDireita(raiz);
		}

		if (balance < -1 && getBalance(raiz.getDireita()) <= 0) {
			return rotacaoEsquerda(raiz);
		}

		if (balance > 1 && getBalance(raiz.getEsquerda()) < 0) {
			raiz.setEsquerda(rotacaoEsquerda(raiz.getEsquerda()));
			return rotacaoDireita(raiz);
		}

		if (balance < -1 && getBalance(raiz.getDireita()) > 0) {
			raiz.setDireita(rotacaoDireita(raiz.getDireita()));
			return rotacaoEsquerda(raiz);
		}

		return raiz;
	}

	private No rotacaoDireita(No y) {
		No x = y.getEsquerda();
		No T2 = x.getDireita();

		x.setDireita(y);
		y.setEsquerda(T2);

		y.setAltura(1 + Math.max(altura(y.getEsquerda()), altura(y.getDireita())));
		x.setAltura(1 + Math.max(altura(x.getEsquerda()), altura(x.getDireita())));

		return x;
	}

	private No rotacaoEsquerda(No x) {
		No y = x.getDireita();
		No T2 = y.getEsquerda();

		y.setEsquerda(x);
		x.setDireita(T2);

		x.setAltura(1 + Math.max(altura(x.getEsquerda()), altura(x.getDireita())));
		y.setAltura(1 + Math.max(altura(y.getEsquerda()), altura(y.getDireita())));

		return y;
	}

	private int altura(No no) {
		return (no == null) ? 0 : no.getAltura();
	}

	private int getBalance(No no) {
		return (no == null) ? 0 : altura(no.getEsquerda()) - altura(no.getDireita());
	}

}
