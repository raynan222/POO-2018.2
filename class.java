protected class numero{
	
	double valor;
	
	numero(double valor){
		this.valor=valor;
	}
	void getValor(){
		return this.valor;
	}
	void setValor(double valor){
		this.valor=valor;
	}
	
}

public class operando extends numero{

	double avaliar(){
		return this.valor;
	}
	operando(double valor){
		super(valor);
	}
		
}

public class operacao{
	
	string nome;
	string simboloOperador;
	
	operacao(string nome, string simboloOperador){
		this.nome=nome;
		this.simboloOperador=simboloOperador;
	}
	
	void setNome(string nome){
		this.nome=nome;
	}
	void setSimboloOperador(string simboloOperador){
		this.simboloOperador=simboloOperador;
	}
	void getNome(){
		return this.nome;
	}
	void getSimboloOperador(){
		return this.simboloOperador;
	}
	void calculaResultado(operando numeroVariado){
		return float;
	}
}
 
public class operacaoBinario extends operacao{

	operacaoBinario(string nome, string simboloOperador){
		super(nome, simboloOperador);
	}
	void calculaResultado(operando numeroVariado){
		return float;
	}
}

public class OperacaoUnitario extends operacao{

	OperacaoUnitario(string nome, string simboloOperador){
		super(nome, simboloOperador);
	}
	void calculaResultado(operando numeroVariado){
		return float;
	}

}

public class OperacaoDivisao extends OperacaoBinario{
	OperacaoDivisao(){
		super("Divisão", "/");
	}
	void calculaResultado(float ... numeros){
		if (numeros.length==2){
			syso(numeros[0] + super.getSimboloOperador() + numeros[1] + " é igual " + numeros[0]/numeros[1]);
		}
		else {
			try {
				throw new Exception("NumeroOperandosException")
			} catch (Exception e){
				syso("Capturada: "+ e);
				e.printStackTrace();
			}
		}
		
	}
}

public class OperacaoFatorial extends OperacaoUnitario{
	OperacaoFatorial(){
		super("Fatorial", "!");
	}
	void calculaResultado(float ... numeros){
		if (numeros.length==1){
			syso(numeros[0] + super.getSimboloOperador() )
		}
		return float;
	}
}
