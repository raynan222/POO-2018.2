public boolean aumentaLimite(double valor){
	if(this.limite<valor){
		return false;
	}
	else{
		this limite=valor;
		return true;
	}
}
