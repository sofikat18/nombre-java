import java.util.Scanner; 
//Importación del código de la clase Scanner desde la biblioteca Java

public class ImpresionNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Por favor, escriba su nombre: ");
		String nombreUser = "";
		Scanner nombreEscaneado = new Scanner (System.in); //Se crea el objeto Scanner
		nombreUser = nombreEscaneado.nextLine(); //Se invoca un método sobre el objeto
		System.out.println("Gracias. Bienvenide, " + nombreUser + ".");
		
		
		//Aparentemente, este método no funciona en un IDE
		
		String nombre2;
		System.out.print("Ingrese su nombre, otra vez: ");
		nombre2 = System.console().readLine();
		System.out.println("¡Hola de nuevo " + nombre2 + "!");
		
	}

}
