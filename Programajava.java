
public class Programajava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// método modidicador de edad (void porque no tiene return)

		// número entero
		int numero = 0;

		// número decimal
		double decimal = 0.1;

		// boolean (verdadero/falso)
		boolean veradero = true;

		boolean falso = false;

		// caracter de texto

		// char a = 'a'

		// cadena de texto

		String unTexto = "Hola Mundo!";

		System.out.println("Hola Mundo!");

		System.out.println("unTexto");

		System.out.println(unTexto + "2");

		int a = 1;
		int b = 3;

		int suma = a + b;

		double c = 2.0;

		System.out.println("suma:" + suma);

		// al sumar un decimal con un entero,

		// el resultado es decimal
		double suma2 = a + c;
		System.out.println("Suma2:" + suma2);

		boolean booleano = true;

		int edad = 19;
		if (edad >= 18) {
			System.out.println("Eres Mayor de edad");

		} else {
			System.out.println("Eres menos de edad");
		}
		int mes = 1;
		switch (mes) {
		case 1:
			System.out.println("Enero");
			break;
		}
		int i = 0;
		while (i < 10) {
			System.out.println("Interación" + i);
			i++;
		}
		for (int j = 0; j < 10; j++) {
			System.out.println("interación for" + j);
		}

		int lista[] = { 1, 2, 3 }; // [1,2,3]
		int lista2[] = new int[3]; // [0,0,0]

		lista[0] = 6; // [6,0,0]
		lista[1] = 3; // [6,3,0]
		lista[2] = -5; // [6,3,-5]

		// Guardar edad de persona1 en una variable

		Persona persona1 = new Persona();

		int edadPersona = persona1.getEdad();

		System.out.println("La edad es" + edadPersona);

		// Modificar la edad
		persona1.setEdad(1);
		System.out.println("Ahora la edad es" + persona1.getEdad());

		System.out.println("El nombre es" + persona1.getNombre());
		persona1.setNombre("Ana Lopez");

		System.out.println("El nombre es" + persona1.getNombre());

		persona1.saludar();
		Persona Paco = new Persona(27, "Paco Martinez");
		Paco.saludar();

		Rectangulo rectangulo = new Rectangulo();
		
		rectangulo.setAltura(60);

		double AlturaRectangulo = rectangulo.getAltura();
		System.out.println("La altura es" + AlturaRectangulo);
	}
}
