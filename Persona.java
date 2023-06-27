
public class Persona {
// atributos o propiedades de clase 
private int edad; 
 private String nombre; 
 private String domicilio;
 
 // metodo constructor
  public Persona (){
	  this.edad = 0;
	  this.nombre = "Sin nombre";
	  
  }
  
  public Persona(int edad, String nombre) {
	  this.edad = edad;
  }
  // metodo constructor de edad 


public void saludar () {
	System.out.println("Hola, me llamo"+ this.nombre + "y tengo" + this.edad + "años"); 
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getDomicilio() {
	return domicilio;
}


public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
}



}