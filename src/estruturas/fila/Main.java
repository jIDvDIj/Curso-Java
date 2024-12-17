package estruturas.fila;

public class Main {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.enqueeu(2);
		fila.enqueeu(4);
		fila.enqueeu(5);
		fila.enqueeu(3);
		fila.enqueeu(2);
		fila.enqueeu(3);
		fila.enqueeu(6);
		fila.enqueeu(7);
		
		fila.print();
		
		fila.dequeue();
		
		fila.print();
		
		
	}
}