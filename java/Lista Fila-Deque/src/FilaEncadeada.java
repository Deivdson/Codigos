
public class FilaEncadeada implements IFila{
	
	private LSE inicio;
	private int t;
	
	public FilaEncadeada() {
		t=0;
		
	}
	
	@Override
	public void enqueue(Object o) {
		LSE node = new LSE(o,inicio);
		inicio = node;
		t++;
		
	}
	
	@Override
	public Object dequeue() throws FilaVaziaException{
		if(isEmpty()) throw new FilaVaziaException("Fila vazia...");
		LSE aux = inicio;
		Object x=aux.value;
		if(t>1) {
			while(aux.next.next!=null) {
				aux=aux.next;
			}
			x = aux.next.value;
		}
		aux.next=null;
		t--;
		return x;
	}

	@Override
	public Object first() {
		LSE aux = inicio;
		Object x=aux.value;
		if(t>1) {
			while(aux.next.next!=null) {
				aux=aux.next;
			}
			x = aux.next.value;
		}
		return x;
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
