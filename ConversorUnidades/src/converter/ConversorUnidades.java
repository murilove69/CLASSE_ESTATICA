package converter;

public class ConversorUnidades {
	// Os métodos podem ser static pois não dependem de nenhum dado específico da
	// Classe, como citado em aula pelo prof.

	// Método para converter Gramas para Libras
	public static double grPraLibra(double gr) {
		return gr * 0.00220462;
	}

	// Método para executar a conversão de Celsius para Fahrenheit.
	public static double celsiusForFahr(double c) {
		return (c * 9 / 5) + 32;
	}

	// Método para converter Quilômetros para Milhas.
	public static double kmPraMilha(double km) {
		return km * 0.621371;
	}

}
