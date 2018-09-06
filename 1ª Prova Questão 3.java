public class numeralis{
	public static void main(String args[]){
		int maior;
		int menor;
		float media;
		for(int i=0;i<args.length;i++){
			int n= Interfer.parseInt(args[i]);
			media += n;
			if(i==0){
				maior=n;
				menor=n;
			}
			else{
				if(maior<n) maior=n;
				if(menor>n) menor=n;
			}
			media = media/args.length;
		}
		syso("medía:" +media+ "maior:" + maior "menor" + menor);
	}
}
