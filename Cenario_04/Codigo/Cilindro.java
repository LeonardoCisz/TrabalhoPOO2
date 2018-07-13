public class Cilindro extends SolidoGeometrico {

	public double altura;

	public double raio;

	public static double PI = 3.14d;

	public void calcularVolume() {
		volume = altura * PI * raio * raio;
	}

}
