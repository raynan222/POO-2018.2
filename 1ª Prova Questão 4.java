public class MisterCard{
	private	String nome;
	private	String numero;
	private int cvv;
	private double limite;
	private double compras;
	
	public void setNome (String n){
		this.nome=n;
	}
	public void getNome (){
		return this.nome;
	}
	public void setNumero (String n){
		this.numero=n;
	}
	public void getNumero (){
		return this.numero;
	}
	public void setCvv (int n){
		this.cvv=n;
	}
	public void getCvv (){
		return this.cvv;
	}
	public void setLimite (double n){
		this.limite=n;
	}
	public void getLimite (){
		return this.limite;
	}
	public void setCompras (double n){
		this.compras=n;
	}
	public void getLimitevol (){
		return this.compras;
	}
	
	public boolean realizarCompras(double valor){
		if (valor<0){
			return false;	
		}
		else if(valor+this.compras>this.limite){
			return false;
		}
		this.compras+=valor;
		return true;
	}
	
	public boolean realizarPagamento(double valor){
		if(valor<0){
			return false;
		}
		else if(valor>this.compras){
			return false;
		}
		this.compras-=valor;
		return true;
	}
}
