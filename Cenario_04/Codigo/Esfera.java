public class Esfera extends SolidoGeometrico {

	public static double PI = 3.14d;

	public double raio;

	public void calcularVolume() {
		volume = PI * raio * raio * raio * (4d/3d);
	}

}
