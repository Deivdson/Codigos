
public class FilaArray implements IFila {
	
	private int capacidade;
	private int inicio,fim;
	private Object[] a;
	
	public FilaArray(int capacidade) {
		this.capacidade = capacidade;
		a= new Object[capacidade];
		inicio=fim=0;
	}

	@Override
	public void enqueue(Object o) {
		if(size()>=capacidade) {
			int cap = capacidade;
			capacidade*=2;
			Object b[] = new Object[capacidade];
			for(int i =0;i<size();i++) {
				b[i]=a[(inicio+i)%cap];
			}
			a=b;
		}
		a[fim]=o;
		fim=(fim+1)%capacidade;
		
	}

	@Override
	public Object dequeue() throws FilaVaziaException{
		if(isEmpty()) throw new FilaVaziaException("Fila vazia...");
		Object aux = a[inicio];
		inicio=(inicio+1)%capacidade;
		return aux;
	}

	@Override
	public Object first() {
		return a[inicio];
	}

	@Override
	public int size() {
		return (capacidade-inicio+fim)%capacidade;
	}

	@Override
	public boolean isEmpty() {
		return inicio==fim;
	}

}
