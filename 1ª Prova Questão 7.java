public class TesteCartão{
	public static void main(String args[]){
		MisterCard c1=new MisterCard();
		c1.setLimite(1000);
		c1.realizaCompras(2.75);
		if(!c1.realizaPagamento(1000)){
			Syso("Não pagou!");
		}
		c1.realizaCompras(2000);
		Syso(c1);
	}

}
