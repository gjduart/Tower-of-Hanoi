
public class torresHanoi {
   private pinos A,B,C;

   torresHanoi(int x){
	   A = new pinos(x);
	   A.preencher();
	  
	   B = new pinos(0);
	   C = new pinos(0);
	   exibirtorre();
   }
  
   public void mover(pinos x , pinos y) {
	   y.insere(x.retira()); 
   }
   public void exibirtorre() {
	   System.out.print("A:"); A.exibir();
	   System.out.print("B:"); B.exibir();
	   System.out.print("C:"); C.exibir();
	   System.out.println("");
	  
   }
   
   public void solucionar(int x,pinos a, pinos c,pinos b) {
	
   if (x>0){
		solucionar(x-1, a, b, c);
		mover(a, c);
		exibirtorre();
		solucionar(x-1, b, c, a);
	}
	   
 

	}   
   public pinos getA() {
		return A;
	}
	public void setA(pinos a) {
		A = a;
	}
	public pinos getB() {
		return B;
	}
	public void setB(pinos b) {
		B = b;
	}
	public pinos getC() {
		return C;
	}
	public void setC(pinos c) {
	}

   }

