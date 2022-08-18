
public class PilhaEncadeada implements IPilha{
	
	private LSE inicio;
	private int t;

	
	public PilhaEncadeada() {
		t=0;
	}
	@Override
	public void push(Object o) {
		LSE node = new LSE(o,inicio);
		inicio = node;
		t++;
	}

	@Override
	public Object pop() throws PilhaVaziaException {
		if(isEmpty()) throw new PilhaVaziaException("Pilha vazia...");
		Object x = inicio.value;
		inicio=inicio.next;
		return x;
	}

	@Override
	public Object top() throws PilhaVaziaException {
		if(isEmpty()) throw new PilhaVaziaException("Pilha vazia...");
		return inicio.value;
	}

	@Override
	public boolean isEmpty() {
		return t==0;
	}

	@Override
	public int size() {
		return t;
	}

	@Override
	public void mostra() {
		// TODO Auto-generated method stub
		
	}

}
