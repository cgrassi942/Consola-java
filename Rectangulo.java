public class Rectangulo {
	private double base;
	private double altura;

	public Rectangulo() {
	}

	// Constructor al que le indiquemos base y altura
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return this.base;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura (double altura) {
		this.altura = altura;

	//metodo para calcular el area (base x altura)
	//ej: calcularArea()
	// debe retornar un valor

	public double calcularArea() {
		return this.base * this.altura;
	}

	// calcularPerimetro() (suma de los lados)
	public double getPerimetro() {
		double perimetro = 2 * base + 2 * altura;
		return perimetro;
	}
	// hacer cuadrado (double lado)
	public void hacerCuadrado(double lado) {
		this.base = lado;
		this.altura = lado;
	}
// dibujar() imprimir el rectangulo *
	
public void dibujar() {
	for (int i = 0; i < this.altura; i ++) {
		for(int j = 0; j< this.base; j++) {
			System.out.println("*");
		}
		System.out.println("");
	}
}
}