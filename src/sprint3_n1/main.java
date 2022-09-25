package sprint3_n1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// aparece string singleton (y no singleton2) porque ha sido reutilizado
		Undo singleton = Undo.getInstance("singleton");
		Undo singleton2 = Undo.getInstance("second singleton");
		System.out.println(singleton.getValue());
		System.out.println(singleton2.getValue());

		menu(singleton);
	}

	public static int opciónElegida() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Elige una de las opciónes:");

		int n = sc.nextInt();

		return n;

	}

	public static String pedidoIntroducido() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el pedido:");

		String pedidoIntroducido = sc.nextLine();

		return pedidoIntroducido;

	}

	public static void menu(Undo singleton) {
		int numero;
		String pedido;

		do {

			System.out.println("0- salir");
			System.out.println("1- añadir pedido");
			System.out.println("2- listar pedidos");
			System.out.println("3- eliminar pedido");

			numero = opciónElegida();

			switch (numero) {

			case 1:

				pedido = pedidoIntroducido();

				singleton.guardar(pedido);
				System.out.println("El pedido " + pedido + " está guardado.");

				break;

			case 2:

				singleton.listar();

				break;
			case 3:

				pedido = pedidoIntroducido();

				singleton.eliminar(pedido);
				System.out.println("El pedido " + pedido + " está eliminado.");

				break;

			}

		} while (numero != 0);

	}
}
