package TAD_Vetor;

public class VetorLDE implements IVetor{
	private LDE inicio, fim, aux;
	private int t;
	
	public VetorLDE() {
		t=0;
		inicio = new LDE();
		fim = inicio;
	}
	@Override
	public Object elementAtRank(int r) throws VetorVazioException {
		if(isEmpty()) throw new VetorVazioException("Vetor vazio!");
		if(r<0 || r>t) throw new IndexOutException("Index out!");
		
		LDE aux = inicio.next;
		for(int i=0; i<r;i++) aux=aux.next;
		return aux.value;
	}
	@Override
	public Object replaceAtRank(int r, Object o) throws VetorVazioException {
		if(isEmpty()) throw new VetorVazioException("Vetor vazio!");
		if(r<0 || r>t) throw new IndexOutException("Index out!");
		LDE aux = inicio.next;
		for(int i=0; i<r;i++) aux=aux.next;
		//LDE new_node = new LDE(o, aux.next, aux.prev);
		Object antigo = aux.value;
		aux.value=o;
		//aux.prev.next=new_node;
		//aux.next.prev=new_node;
		
		return antigo;
	}
	@Override
	public void insertAtRank(int r, Object o) {
		if(r<0 || r>t) throw new IndexOutException("Index out!");
		aux = inicio;
		LDE node = new LDE();
		node.value=o;
		//System.out.println(fim.value+"-"+inicio.value+"-"+node.value);
		if(t==0) {
			aux.next=node;
			node.prev=aux;
			fim=aux;
			
		}
		if(r==t) {
			fim.next=node;
			node.prev=fim;
			fim=node;
			
		}
		else {
			
			for(int i=0; i<r;i++) aux=aux.next;
			aux.prev.next=node;
			node.prev=aux.prev;
			aux.prev=node;
			node.next=aux;
		}
		t++;
	}
	@Override
	public Object removeAtRank(int r) throws VetorVazioException {
		if(isEmpty()) throw new VetorVazioException("Vetor vazio!");
		if(r<0 || r>t) throw new IndexOutException("Index out!");
		
		aux = inicio.next;
		
		if(t==0) {
			aux.next.prev=null;
			inicio=aux.next;
		}
		else if(r==t) {
			aux=fim;
			aux.prev.next=null;
			fim=aux.prev;
		}
		else {
			for(int i=0; i<r;i++) aux=aux.next;
			aux.prev.next=aux.next;
			if(aux.next!=null)aux.next.prev=aux.prev;
		}		
		t--;
		return aux.value;
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
