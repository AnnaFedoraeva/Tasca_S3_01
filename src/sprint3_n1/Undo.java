package sprint3_n1;

import java.util.ArrayList;

public class Undo {

	private ArrayList<String> pedidos;
	private static Undo instance;
	private String value;

	public ArrayList<String> getPedidos() {
		return pedidos;
	}

	public static Undo getInstance() {
		return instance;
	}

	public static void setInstance(Undo instance) {
		Undo.instance = instance;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setPedidos(ArrayList<String> pedidos) {
		this.pedidos = pedidos;
	}

	private Undo(String value) {
		this.value = value;
		pedidos = new ArrayList<>();
	}

	public void guardar(String pedido) {

		pedidos.add(pedido);

	}

	public void eliminar(String pedido) {

		pedidos.remove(pedido);

	}

	public void listar() {

		for (String listar : pedidos) {

			System.out.println(listar);
		}

	}

	public static Undo getInstance(String value) {

		if (instance == null) {
			instance = new Undo(value);
		} 

		return instance;
	}

}
