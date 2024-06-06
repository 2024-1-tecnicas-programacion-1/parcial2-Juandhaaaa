package parcial2;

public class Automovil {
   // Subclase Automovil
class Automovil extends Vehiculo {
// Atributos adicionales
private int numeroPuertas;

// Constructor
public Automovil(String marca, String modelo, int año, TipoCombustible tipoCombustible, int numeroPuertas) {
super(marca, modelo, año, tipoCombustible);
this.numeroPuertas = numeroPuertas;
}

// Sobrescritura del método imprimirInformacion()
public String imprimirInformacion() {
return super.imprimirInformacion() + ", " + numeroPuertas + " puertas, tipo de combustible " + getTipoCombustible();
}

// Getter y setter para numeroPuertas
public int getNumeroPuertas() {
return numeroPuertas;
}

public void setNumeroPuertas(int numeroPuertas) {
this.numeroPuertas = numeroPuertas;
}
}

public class Main {
public static void main(String[] args) {
// Ejemplo de uso
//Automovil miAutomovil = new Automovil("Toyota", "Corolla", 2020, TipoCombustible.GASOLINA, 4);
//System.out.println(miAutomovil.imprimirInformacion());
}
}
}
