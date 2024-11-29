package liveCoding03;

import java.util.Scanner;

public class liveCoding03 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Introduce el número de mangos:");  // número de mangos 
	        int mangos = scanner.nextInt();

	        System.out.println("Introduce el número de naranjas:"); // número de naranjas
	        int naranjas = scanner.nextInt();

	        // Crear un objeto de la clase MangosNaranjas
	        MangosNaranjas cajas = new MangosNaranjas(mangos, naranjas);

	        // Imprimir el resultado
	        cajas.imprimir();

	        scanner.close();
			}
	


/*
 * En este reto reforzaras tus conocimientos en Java, manejando ciclos, condicionales e recibir e imprir datos por consola.

*1.- Construye un programa que pida por consola 2 números. El número de mangos y el número de naranjas.

2.- Debes de meter esos mangos y naranjas en cajas.

3.- El número de mangos en cada caja debe ser el mismo. El número de naranjas en cada caja debe ser el mismo.

4.- El número de cajas debe ser el máximo posible.

5.- Debes imprimir el número de cajas, el número de mangos por cajas y el número de naranjas por cajas.

6.- Debes escribir el código en una clase llamada MangosNaranjas que tenga dos atributos: mangos, naranjas, y por lo menos un método imprimir. Debe recibir por el constructor los parametros de el número de mangos y el número de naranjas.

7.- En una clase Main, debes crear un objeto de dicha clase para imprimir el resultado.

Ejemplo:
Entradas: 12028 12772
Salida: El número de cajas es: 124 El número de mangos en una caja es: 103 El número de naranjas en una caja es: 97
 * */
}
