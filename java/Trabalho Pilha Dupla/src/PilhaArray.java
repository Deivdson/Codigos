
public class PilhaArray implements IPilha {
	private int capacidade;
	private Object[] a;
	private int tv;
	private int tp;
	
	
	public PilhaArray(int capacidade) {
		this.capacidade=capacidade;
		tv=tp=-1;
		a= new Object[capacidade];
	}
	
	public void push(Object obj) {
		if(size()>=capacidade) {
			int antiga = capacidade;
			capacidade*=2;
			Object b[] = new Object[capacidade];
			for(int f=0;f<size();f++)
				b[f] = a[f];
					
			for(int f=1;f<sizep()+1;f++)
				b[capacidade-f]=a[antiga-f];
			a=b;
		}
		a[++tv]=obj;
	}
	
	public Object pop() throws PilhaVaziaException {
		if(isEmpty()) throw new PilhaVaziaException("Pilha vermelha vazia...");
		return a[tv--];
	}
	
	public Object top() throws PilhaVaziaException{
		if(isEmpty()) throw new PilhaVaziaException("Pilha vermelha vazia...");
		return a[tv];
	}
	
	public int size() {
		return tv + 1;
	}
	
	public boolean isEmpty() {
		return tv == -1;
	}
	public void mostrav() {
		System.out.println("------pilha rubro-mostra-----");
		for(int i=0; i<size();i++) {
			System.out.println(a[i]);
		}
		System.out.println("----------------------------");
	}

	@Override
	public void pushp(Object o) {
		if(sizep()>=capacidade-1) {
			int antiga = capacidade;
			capacidade*=2;
			Object b[] = new Object[capacidade];
			for(int f=0;f<size();f++)
				b[f] = a[f];
			for(int f=1;f<sizep()+1;f++)
				b[capacidade-f]=a[antiga-f];
			a=b;
		}
		++tp;
		a[(capacidade-1)-tp]=o;
	}

	@Override
	public Object popp() throws PilhaVaziaException {
		if(isEmptyp()) throw new PilhaVaziaException("Pilha preta vazia...");
		Object aux=a[capacidade-sizep()];
		tp--;
		return aux;
	}

	@Override
	public Object topp() throws PilhaVaziaException {
		if(isEmpty()) throw new PilhaVaziaException("Pilha preta vazia...");
		return a[capacidade-sizep()];
	}

	@Override
	public boolean isEmptyp() {
		return tp==-1;
	}

	@Override
	public int sizep() {
		return tp+1;
	}

	@Override
	public void mostrap() {
		System.out.println("-------pilha negro-mostra-----");
		for(int i=1; i<=sizep();i++) {
			System.out.println(a[capacidade-i]);
		}
		System.out.println("----------------------------");
		
	}
}
