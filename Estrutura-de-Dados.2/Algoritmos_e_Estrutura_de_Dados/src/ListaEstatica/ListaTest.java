package ListaEstatica;

public class ListaTest {
	
	public static void main(String[] args) {
		ListaEstatica<Integer> lista = new ListaEstatica<>();
		
		lista.inserir(50);
		lista.inserir(-15);
		lista.inserir(12);
		lista.inserir(28);
		lista.inserir(91);
		lista.inserir(198);
		lista.inserir(55);
		lista.inverter();
	}
	
}
