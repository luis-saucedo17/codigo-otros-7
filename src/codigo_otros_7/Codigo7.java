package codigo_otros_7;

//Faltaba importar las clases Scanner y Hashmap

import java.util.Scanner;
import java.util.HashMap;

//El nombre de la case tenía un acento
public class Codigo7 {

	// Faltaba un método main para ejecutar
	public static void main(String[] args) {

		// Faltaba agregarle como parámetro System.in
		Scanner s = new Scanner(System.in);

		HashMap<String, String> capitales = new HashMap<>();
		capitales.put("Canadá", "Ottawa");
		capitales.put("Estados Unidos", "Washington DC");
		capitales.put("México", "Ciudad de México");
		capitales.put("Belice", "Belmopán");
		capitales.put("Costa Rica", "San José");
		capitales.put("El Salvador", "San Salvador");
		capitales.put("Guatemala", "Ciudad de Guatemala");
		capitales.put("Honduras", "Tegucigalpa");
		capitales.put("Nicaragua", "Managua");
		capitales.put("Panamá", "Ciudad de Panamá");

		// Está mal escrito String
		String c = "";

		do {
			System.out.print("Escribe el nombre de un país y te diré su capital: ");
			c = s.nextLine();

			if (!c.equalsIgnoreCase("salir")) {
				// contains Key nos sirve para ver si se tiene una determinada clave
				if (capitales.containsKey(c)) {
					System.out.println("La capital de " + c + " es " + capitales.get(c));
				} else {
					System.out.print("No conozco la respuesta, ¿cuál es la capital de " + c + "?: ");
					String capital = s.nextLine();
					capitales.put(c, capital);  //Se agrega la clave (país) y el valor (capital) proporcionados por el usuario al mapa
					System.out.println("Gracias por enseñarme nuevas capitales.");
				}
			}
			// En vez de utilizar equals se utiliza equalsIgnoreCase para comparar sin
			// importar la capitalización
		} while (!c.equalsIgnoreCase("salir"));
	}
}