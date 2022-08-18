package TAD_Lista;

public class ListaDE implements ILista{
	
	private Node first, last, aux;
	private int t;
	
	
	public ListaDE() {
		t=0;
	}
	@Override
	public Object first() {
		return first;
	}

	@Override
	public Object last() {
		return last;
	}

	@Override
	public Object before(Node p) {
		return p.prev;
	}

	@Override
	public Object after(Node p) {
		return p.next;
	}

	@Override
	public void replaceElement(Node n, Object o) {
		n.value=o;
	}

	@Override
	public void swapElements(Node n, Node q) {
		Object x = n.value;
		n.value = q.value;
		q.value = x;
		
	}

	@Override
	public void insertBefore(Node n, Object o) {
		Node novo = new Node(o, n, null);
		aux = first;
		while(aux!=n)aux=aux.next;
		
		if(n.prev!=null) {
			novo.prev=n.prev;
			n.prev.next=novo;
		}
		n.prev=novo;
		t++;
	}

	@Override
	public void insertAfter(Node n, Object o) {
		Node novo = new Node(o, null, n);
		
		if(n.next!=null) {
			novo.next=n.next;
			n.next.prev=novo;
		}
		n.next=novo;
		t++;
	}

	@Override
	public void insertFirst(Object o) {
		if(isEmpty()) {
			first = new Node(o,null,null);
			last=first;
		}
		else{
			Node novo = new Node(o, first, null);
			first=novo;
		}
		t++;
	}

	@Override
	public void insertLast(Object o) {
		if(isEmpty()) {
			last= new Node(o,null,null);
			first=last;
		}
		else {
			Node novo = new Node(o, null, last);
			last=novo;
		}
		t++;
	}

	@Override
	public Object remove(Node n) {
		if(n.prev!=null && n.next!=null) {
			n.prev.next=n.next;
			n.next.prev=n.prev;
		}
		else if(n.prev!=null) n.prev.next=null;
		else if(n.next!=null) n.next.prev=null;
		t--;
		return n.value;
	}

	@Override
	public int size() {
		return t;
	}

	@Override
	public boolean isEmpty() {
		return t==0;
	}

	@Override
	public boolean isFirst(Node n) {
		return n==first;
	}

	@Override
	public boolean isLast(Node n) {
		return n==last;
	}


}
