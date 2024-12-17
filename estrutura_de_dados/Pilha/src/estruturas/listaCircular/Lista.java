package estruturas.listaCircular;

public class Lista {

	private No ref;

	public Lista() {
		this.ref = null;
	}

	public void insere(int info) {
		No novoNo = new No(info, null);

		if (ref == null) {
			novoNo.setProx(novoNo);
			ref = novoNo;
			return;
		}
		if (info < ref.getProx().getInfo()) {
			novoNo.setProx(ref.getProx());
			ref.setProx(novoNo);
			return;
			
		}
		
		if (info > ref.getInfo()) {
			novoNo.setProx(ref.getProx());
			ref.setProx(novoNo);
			ref = novoNo;
			return;
		}
		for (No itemLista = ref.getProx(); itemLista != ref; itemLista = itemLista.getProx()) {
			if (info < itemLista.getProx().getInfo()) {
				novoNo.setProx(itemLista.getProx());
				itemLista.setProx(novoNo);
				return;
			}
			if (itemLista.getProx()==ref) {
				novoNo.setProx(ref.getProx());
				ref.setProx(novoNo);
				ref = novoNo;
				return; 
			}
		}

	}

	public void remove(int info, boolean duplicados) {
		int contadorRemoção = 0;
		if (ref == null) {
			System.out.println("A lista está vazia");
			return;
		}
		
		if (ref.getProx()==ref) {
			if(ref.getInfo() == info) {
				ref = null;
				return;
			}
		}

		for (No itemLista = ref.getProx(); itemLista != ref; itemLista = itemLista.getProx()) {

			if (itemLista.getInfo() > info) {
				if (contadorRemoção < 1) {
					System.out.println("O valor não pertence a lista");
				}
				return;
			}

			if (itemLista.getInfo() == info) {
				ref.setProx(ref.getProx().getProx());
				if (duplicados == false) {
					return;
				} else {
					contadorRemoção += 1;
					continue;
				}
			}

			if (itemLista.getProx() == ref) {
				if (ref.getInfo() == info) {
					itemLista.setProx(ref.getProx());
					ref = itemLista;
					if (duplicados == false) {
						return;
					} else {
						contadorRemoção += 1;
						continue;
					}
				} else {
					System.out.println("O valor não pertence a lista");
				}
			}

			if (itemLista.getProx().getInfo() == info) {
				while (itemLista.getProx().getInfo() == info) {

					itemLista.setProx(itemLista.getProx().getProx());
					if (duplicados == false) {
						return;
					} else {
						contadorRemoção += 1;
						continue;
					}
				}
			}
		}
	}

	public String imprime() {
		String valoresLista = "";
		if (ref == null) {
			return "lista vazia";
		}
		for (No imprimir = ref.getProx(); imprimir != ref; imprimir = imprimir.getProx()) {
			valoresLista = valoresLista + imprimir.getInfo() + " ";
		}
		valoresLista = valoresLista + ref.getInfo();
		return valoresLista;
	}
}