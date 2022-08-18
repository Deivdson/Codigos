
public class FilaE implements IFila{
	
	private LSE inicio, fim;
	private int t;
	
	public FilaE() {
		t=0;
	}
	
	@Override
	public void enqueue(Object o) {
		LSE node = new LSE();
		node.value=o;
		
		if(isEmpty()) {
			inicio=node;
			fim=inicio;
		}else {
			fim.next=node;
			fim=node;
		}
		
		t++;
	}
	
	@Override
	public Object dequeue() throws FilaVaziaException{
		if(isEmpty()) throw new FilaVaziaException("Fila vazia...");
		Object x = inicio.value;
		inicio=inicio.next;
		t--;
		return x;
	}

	@Override
	public Object first() {
		return inicio.value;
	}

	@Override
	public int size() {
		return t;
	}

	@Override
	public boolean isEmpty() {
		return t==0;
	}

}
