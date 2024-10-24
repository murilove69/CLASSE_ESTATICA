package main;
import converter.*;
public class Main {
    public static void main(String[] args) {
        // Exemplos de uso da classe ConversorUnidades

        //No meu entendimento, fiz assim a inserçãom dos valores, visto que como os métodos são static
    	//Então são independentes e não necessitam de um Construtor ou de serem informados mais especificamente.
    	
    	 // Fazendo a conversão de Gramas para Libras.
        double gr = 1200.0;
        double libras = ConversorUnidades.grPraLibra(gr);
        System.out.println(gr + " gramas equivalem a " + libras + " libras.");
        
    	// Convertendo Celsius para Fahrenheit.(Puta nome chato de escrever, diga-se de passagem).
        double c = 23.0;
        double fahrenheit = ConversorUnidades.celsiusForFahr(c);
        System.out.println(c + "°C equivale a " + fahrenheit + "°F.");

        // Convertendo Quilômetros para Milhas.
        double km = 90.0;//Distância de São Miguel até aqui, mó longe.
        double milhas = ConversorUnidades.kmPraMilha(km);
        System.out.println(km + " km(s) equivale a " + milhas + " milhas.");
    }
}
