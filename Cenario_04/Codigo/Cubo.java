public class Cubo extends SolidoGeometrico {

	public double base;

	public double altura;

	public void calcularVolume() {
		volume = (base * base * base) * (altura * altura * altura);
	}

}
