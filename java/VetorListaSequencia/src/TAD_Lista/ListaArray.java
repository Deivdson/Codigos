package TAD_Lista;

public class ListaArray implements IListaArray{
	
	private int t, capacidade;
	private Object[] a;
	public ListaArray(int capacidade){
		this.capacidade=capacidade;
		t=-1;
		a = new Object[capacidade];
	}
	@Override
	public Object first() {
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		return a[0];
	}
	@Override
	public Object last() {
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		return a[t];
	}
	@Override
	public Object before(int p) {
		if(p>t || p<0) throw new IndexOutException("Index Out!");
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		return a[p-1];
	}
	@Override
	public Object after(int p) {
		if(p>t || p<0) throw new IndexOutException("Index Out!");
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		return a[p+1];
	}
	@Override
	public void replaceElement(int n, Object o) {
		if(n>t || n<0) throw new IndexOutException("Index Out!");
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		a[n]=o;
	}
	@Override
	public void swapElements(int n, int q) {
		if((n>t || n<0) || (q>t || q<0) ) throw new IndexOutException("Index Out!");
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		Object x = a[n];
		a[n]=a[q];
		a[q]=x;
		
	}
	@Override
	public void insertBefore(int n, Object o) {
		if(n>t || n<0) throw new IndexOutException("Index Out!");
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		t++;
		if(t>=capacidade) capacidade*=2;
		Object[] b = new Object[capacidade];
		for(int i=0;i<n;i++) b[i]=a[i];
		b[n]=o;
		for(int i=n+1;i<t;i++)b[i]=a[i-1];
		a=b;
	}
	@Override
	public void insertAfter(int n, Object o) {
		if(n>t || n<0) throw new IndexOutException("Index Out!");
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		t++;
		if(t+2>=capacidade) capacidade*=2;
		Object[] b = new Object[capacidade];
		for(int i=0;i<=n;i++) b[i]=a[i];
		b[n+1]=o;
		for(int i=n+2;i<t+2;i++) b[i]=a[i-2];
		a=b;		
	}
	@Override
	public void insertFirst(Object o) {
		t++;
		if(t>=capacidade) capacidade*=2;
		Object[] b = new Object[capacidade+1];
		b[0]=o;
		System.out.println(b[0]);
		for(int i=1; i<=t;i++) {
			b[i]=a[i-1];
		}
		a=b;
		
	}
	@Override
	public void insertLast(Object o) {
		t++;
		if(t>=capacidade) capacidade*=2;
		Object[] b = new Object[capacidade];
		b[t]=o;
		System.out.println(b[t]+"-"+capacidade+"-"+t);
		for(int i=0; i<t;i++) {
			b[i]=a[i];
		}
		a=b;
	}
	@Override
	public Object remove(int n) {
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		if(n>t || n<0) throw new IndexOutException("Index Out!");
		System.out.println(n+"-"+t);
		Object x = a[n];
		for(int i=n; i<t ;i++) a[i]=a[i+1];
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
		return false;
	}
	@Override
	public boolean isLast(int n) {
		if(isEmpty()) throw new ListaVaziaException("Lista vazia!");
		return false;
	}
	
	private void reSize() {
		
	}
	


}
