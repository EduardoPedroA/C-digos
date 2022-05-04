package Motos;

import java.util.Scanner;

public class Moto {



		private String placa;
	    private double potencia;
	    private String modelo;
	    private String cor;
	    private String marca;
	    private int ano;
	    private float preco;


	public Moto(
			String placa,
			double potencia,
			String modelo,
			String cor,
	        String marca,
	        int ano,
	       float preco) 
	{
		this.placa=placa;
		this.potencia=potencia;
		this.modelo=modelo;
		this.cor=cor;
		this.marca=marca;
		this.ano=ano;
		this.preco=preco;
	}


	public static void main(String[] args) {
		
		Moto C1 = new Moto("FDP0589", 150, "titan", "Cinza", "Honda", 2000,  11000);
		Moto C2 = new Moto ("PAOH456", 5.9, "Brasilia", "Branco", "Chevrolet",2021, 550000);
		Scanner resposta= new Scanner(System.in);
		System.out.println("Qual a placa do veículo?");
		C1.placa=resposta.next();
		System.out.println("Qual o motor?");
		C1.potencia=resposta.nextDouble();
		System.out.println("Qual módelo?");
		C1.modelo=resposta.next();
		System.out.println("Qual cor?");
		C1.cor=resposta.next();
		System.out.println("Qual a marca?");
		C1.marca=resposta.next();
		System.out.println("Qual ano?");
		C1.ano=resposta.nextInt();
		System.out.println("Qual valor?");
		C1.preco=resposta.nextFloat();
		
		
		
		System.out.println("Fim do cadastro");
		
		
		
	}
}