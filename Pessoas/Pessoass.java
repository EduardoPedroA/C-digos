package Pessoas;

import java.util.Scanner;


public class Pessoass {



		private String Nome;
	    private String CPF;
	    private String Email;
	    private String Data_de_Nascimento;



	public Pessoass(
			String Nome,
			String CPF,
			String Email,
			String Data_de_Nascimento) 
	{
		this.Nome=Nome;
		this.CPF=CPF;
		this.Email=Email;
		this.Data_de_Nascimento=Data_de_Nascimento;
	}


	public static void main(String[] args) {
		
		Pessoass C1 = new Pessoass("Eduardo","156496565","djhsdjshdfjh@ggahasd.com","05/06/20023");
		Pessoass C2 = new Pessoass ("Duda","1564965","sdgsd@fdgdg.com","22/07/2005");
		Scanner resposta= new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		C1.Nome=resposta.next();
		System.out.println("Qual o seu CPF?");
		C1.CPF=resposta.next();
		System.out.println("Qual o seu Email?");
		C1.Email=resposta.next();
		System.out.println("Qual a Data de Nascimento?");
		C1.Data_de_Nascimento=resposta.next();
		System.out.println("Qual a marca?");

		
		
		
		System.out.println("Fim do cadastro");
		
		
	}
}