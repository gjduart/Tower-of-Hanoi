import java.util.ArrayList;

public class pinos {

	
	
	private int indice;
    private int topo;

	ArrayList< Integer  > Discos = new ArrayList< Integer >();
	
	
	pinos(int tamanho){
		this.indice = tamanho;
		
	}
	
	public void preencher() {
		if (Discos.lastIndexOf(Discos) < indice) {
			if (indice >0 ) {
			Discos.add(indice);
			indice--;
			preencher();
			}
		}
		
	}
	
	public void insere(int x) {
			Discos.add(x);
	}
	
	public int retira() {
		 int aux = 0;
		   aux =   Discos.remove(Discos.size()-1);
		    
				return setTopo(aux);
		   
	}
	
	public void exibir() {
			System.out.println("*"+ Discos);
	}
	
	public int getTopo() {
		return topo;
	}

	public int setTopo(int topo) {
		return this.topo = topo;
	}

}
