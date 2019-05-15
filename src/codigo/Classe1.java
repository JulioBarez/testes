package codigo;
/**
 * @author julio
 * 
 */
public class Classe1 {
	public int fibonacci (int n) {
		int atual=0, anterior=1, anteterior=0;
		for (int i=1; i<=n;i++){
			anteterior = anterior;
			anterior = atual;
			atual = anterior+anteterior;
		}
		return atual;
		
	}

}
