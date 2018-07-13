public class Main {

	public static void main(String[] args) {
		
		Cubo cubo = new Cubo();
		cubo.altura = 10;
		cubo.base = 5.5d;
		cubo.calcularVolume();
		
		Piramide piramide = new Piramide();
		piramide.areaBase = 8;
		piramide.altura = 4;
		piramide.calcularVolume();
		
		Cilindro cilindro = new Cilindro();
		cilindro.altura = 7.7d;
		cilindro.raio = 3.3d;
		cilindro.calcularVolume();
		
		Esfera esfera = new Esfera();
		esfera.raio = 4.5d;
		esfera.calcularVolume();
		
		ImpressorGeometrico impressorGeometrico = new ImpressorGeometrico();
		impressorGeometrico.imprimirSolido(cubo);
		impressorGeometrico.imprimirSolido(piramide);
		impressorGeometrico.imprimirSolido(cilindro);
		impressorGeometrico.imprimirSolido(esfera);
		
	}

}
