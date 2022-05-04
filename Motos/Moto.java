package Motos;

public class Moto {


	
    private String modelo;
    private int potencia;
    private String cor;
    private int ano;
    private static float preco;
    
public Moto(
		
	    
	    String modelo,
	    int potencia,
	    String cor,
	     int ano,
	    float preco)
{
	    
	    this.modelo=modelo;
	    this.potencia=potencia;
	    this.cor=cor;
	    this.ano=ano;
	  
	    
	    
			
	
}
public float get_preco() {
	return preco;
}

public void set_preco( float novopreco) {
	preco=novopreco;
}

public void listar(Moto m) {
	System.out.println(
			"Modelo: "+m.modelo + "\n" +
			"Potência: "+m.potencia + "\n" +
			"Cor: "+m.cor + "\n" +
			"Ano: "+m.ano+"\n"
			
			
);
}
	public static void main(String[] args) {
		
		
		Moto moto1 = new Moto("Honda",150,"cinza",2021, preco);
		
		
		moto1.listar(moto1);
		
	}

}
