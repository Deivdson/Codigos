package Pilha;

public class PilhaArray implements IPilha {
	private int capacidade;
	private Object[] a;
	private int t;
	
	
	public PilhaArray(int capacidade) {
		this.capacidade=capacidade;
		t=-1;
		a= new Object[capacidade];
	}
	
	public void push(Object obj) {
		if(t>=capacidade-1) {
			capacidade*=2;
			Object b[] = new Object[capacidade];
			for(int f=0;f<a.length;f++)
				b[f] = a[f];
			a=b;
		}
		a[++t]=obj;
	}
	
	public Object pop() throws PilhaVaziaException {
		if(isEmpty()) throw new PilhaVaziaException("Pilha vazia...");
		return a[t--];
	}
	
	public Object top() throws PilhaVaziaException{
		if(isEmpty()) throw new PilhaVaziaException("Pilha vazia...");
		return a[t];
	}
	
	public int size() {
		return t + 1;
	}
	
	public boolean isEmpty() {
		return t == -1;
	}
	public void mostra() {
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
