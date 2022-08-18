package TAD_Lista;

public class ListaLDE implements IListaArray{
	private Node first, last, aux;
	private int t;
	
	
	public ListaLDE() {
		t=-1;
	}
	@Override
	public Object first() {
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		return first.value;
	}
	@Override
	public Object last() {
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		return last.value;
	}
	@Override
	public Object before(int p) {
		if(p>=t || p<1) throw new IndexOutException("Index Out!");
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		aux=first;
		for(int i=0; i<p-1; i++) aux=aux.next;
		return aux.value;
	}
	@Override
	public Object after(int p) {
		if(p>=t || p<0) throw new IndexOutException("Index Out!");
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		aux=first;
		for(int i=0; i<=p; i++) aux=aux.next;
		return aux.value;
	}
	@Override
	public void replaceElement(int n, Object o) {
		if(n>t || n<0) throw new IndexOutException("Index Out!");
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		aux=first;
		for(int i=0; i<n; i++) aux=aux.next;
		aux.value=o;
	}
	@Override
	public void swapElements(int n, int q) {
		if((n>t || n<0) || (q>t || q<0) ) throw new IndexOutException("Index Out!");
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		Node node = new Node();
		
		if(n>t/2) {
			node = first;
			for(int i=0; i<q; i++) aux=aux.next;
		}else {
			node=last;
			for(int i=t; i>q; i--) aux=aux.prev;
		}
		if(q<t/2) {
			aux=first;
			for(int i=0; i<n;i++) node=node.next;
		}
		else {
			aux=last;
			for(int i=t; i>q; i--) node=node.prev;
		}
		

		Object x = aux.value;
		
		
		aux.value=node.value;
		node.value=x;
		
	}
	@Override
	public void insertBefore(int n, Object o) {
		if(n>t || n<0) throw new IndexOutException("Index Out!");
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		
		aux=first;
		for(int i=0; i<n; i++) aux=aux.next;
		Node node = new Node(o,null,null);
		if(aux.prev!=null) {
			node.prev=aux.prev;
			aux.prev.next=node;
		}
		node.next=aux;
		aux.prev=node;
		t++;
	}
	@Override
	public void insertAfter(int n, Object o) {
		if(n>t || n<0) throw new IndexOutException("Index Out!");
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		aux=first;
		for(int i=0; i<n; i++) aux=aux.next;
		Node node = new Node(o,null,null);
		if(aux.next!=null) {
			node.next=aux.next;
			aux.next.prev=node;
		}
		node.prev=aux;
		aux.next=node;
		t++;		
	}
	@Override
	public void insertFirst(Object o) {
		Node node = new Node(o,null,null);
		if(!(isEmpty())) {
			node.next=first;
			first.prev=node;
		}else {
			last=node;
		}
		first=node;
		t++;
		
	}
	@Override
	public void insertLast(Object o) {
		Node node =  new Node(o,null,null);
		if(!(isEmpty())) {
			node.prev=last;
			last.next=node;
		}else {
			first=node;
		}
		last=node;
		t++;
	}
	@Override
	public Object remove(int n) {
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		if(n>t || n<0) throw new IndexOutException("Index Out!");
		if(n<t/2) {
			aux=first;
			for(int i=0;i<n;i++) aux=aux.next;
			
		}else {
			aux=last;
			for(int i=t;i<n;i--) aux=aux.prev;
		}
		
		Object x = aux.value;
		if(aux.next!=null && aux.prev!=null) {
			aux.prev.next=aux.next;
			aux.next.prev=aux.prev;
		}else if(aux.next==null) {
			last=aux.prev;
			aux.prev.next=null;
		}else if(aux.prev==null) {
			first=aux.next;
			aux.next.prev=null;
		}
		
		t--;
		return x;
	}
	@Override
	public int size() {
		return t+1;
	}
	@Override
	public boolean isEmpty() {
		return t==-1;
	}
	@Override
	public boolean isFirst(int n) {
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		return n==(int)first.value;
	}
	@Override
	public boolean isLast(int n) {
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		return n==(int)last.value;
	}

}
