import java.util.ArrayList;
import java.util.Scanner;

/*
 * Agregar un main donde se le muestre al usuario un menú de opciones
 *	1- Agregar cuadrado
 *  2- Agregar rectángulo
 *  3- Mostrar todas las superficies
 *  4- Mostrar todos los perimétros
 *  5- Salir  
 */

public class Programa {

	public static void main(String[] args) {
		ArrayList < Forma > lista = new ArrayList < Forma >();
		init(lista);
	}
	
	public static void init(ArrayList < Forma > lista)
	{
		Scanner data = new Scanner(System.in);
		Integer opcion;
		Boolean exit = false;
		
		do {
			mostrarMenu();
			opcion = getOpcion(data);
			
			switch (opcion)
			{
				case 1:
				//	Forma auxC = crearCuadrado(data);
					lista.add( crearCuadrado(data) );
					break;
				
				case 2:
					Forma auxR = crearRectangulo(data);
					lista.add(auxR);
					break;
					
				case 3:
					System.out.println("\n\n\n\n\n\n\n\n\n\n");
					for (Forma f: lista)
					{
						System.out.println("Superficie: " + f.superficie());
					}
					System.out.println("\n\n\n\n\n\n\n\n\n\n");
					break;
				
				case 4:
					System.out.println("\n\n\n\n\n\n\n\n\n\n");
					for (Forma f: lista)
					{
						System.out.println("Perimétro: " + f.perimetro());
					}
					System.out.println("\n\n\n\n\n\n\n\n\n\n");
					break;
					
				case 5:
					exit = true;
					break;
					
				default:
			}
		} while(!exit);
	}
	
	public static void mostrarMenu()
	{
		System.out.println("1. Agregar cuadrado");
		System.out.println("2. Agregar rectángulo");
		System.out.println("3. Mostrar todas las superficies");
		System.out.println("4. Mostrar todos los perimétros");
		System.out.println("5. Salir");
	}
	
	public static Integer getOpcion(Scanner data)
	{
		System.out.print("Ingrese la opción: ");
		return data.nextInt();
	}
	
	public static Forma crearCuadrado(Scanner data)
	{
		Double aux;
		System.out.print("Ingrese la medida del lado: ");
		aux = data.nextDouble();
		
		return Factory.createForma(aux);
	}
	
	public static Forma crearRectangulo(Scanner data)
	{
		Double aux, aux2;
		System.out.print("Ingrese la medida del lado 1 (base): ");
		aux = data.nextDouble();
		
		System.out.print("Ingrese la medida del lado 2 (altura): ");
		aux2 = data.nextDouble();
		
		return Factory.createForma(aux, aux2);
	}
}
